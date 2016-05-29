/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.text.DecimalFormat;

/**
 *
 * @author vichet
 */
public class AdapterTest {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone();
        ICOM icom = new ICOM();
        
        WallSocket.on();
        iPhone.charge();
        
        WallSocket.off();
        icom.charge();

        WallSocket.on();
        ColorTV colorTV = new ColorTV();
        colorTV.play("CNN");
               
        
    }

}

abstract class ElectronicEquipment {
    protected Adapter adapter;
    protected String name;

    public String getName() {
        return this.name;
    }
    
    protected abstract void operate(String operation);
}

class RechargableEquipment extends ElectronicEquipment {

    protected double POWER_CAPAICITY;
    protected double power = 0.0;

    @Override
    protected void operate(String operation) {
        charge();
    }

    public void charge() {
        Runnable thread = new Runnable() {

            @Override
            public void run() {
                double chargingPower = adapter.getPower();

                if (chargingPower == 0) {
                    System.out.println("No Power!, "
                            + getName() +" can not be charged.");
                } else {
                    try {
                        while (power < POWER_CAPAICITY) {
                            power += adapter.getPower();
                            System.out.println(getName() + " is charging : "
                                    + new DecimalFormat("0.00").format(power));
                            Thread.sleep(10);
                        }
                        System.out.println(getName() + "'s battery is fully charged");

                    } catch (InterruptedException e) {

                    }
                }
            }
        };
        thread.run();

    }
}

class ACEquipment extends ElectronicEquipment {
    
    protected void operate(String operation){        
        if (adapter.getPower() == 0) {
            System.out.println("No Power!, " +
                    getName() + " can not operate.");
        } else {
            System.out.println(operation);
        }
    }
}

class WallSocket {

    private double vol = 220;
    private static boolean isOFF = true;

    public double getPower() {
        if (isOFF) {
            return 0.0;
        } else {
            return vol;
        }
    }

    public static void off() {
        isOFF = true;
    }

    public static void on() {
        isOFF = false;
    }

    public boolean isOFF() {
        return isOFF;
    }
}

class Adapter extends WallSocket {

    private ElectronicEquipment ee;

    public Adapter(ElectronicEquipment ee) {
        this.ee = ee;
    }

    @Override
    public double getPower() {
        if (super.isOFF()) {
            return 0.0;
        } else {
            if (ee instanceof IPhone) {
                return 0.01;
            } else if (ee instanceof ICOM) {
                return 0.10;
            } else if (ee instanceof ACEquipment) {
                return 220.0;
            } else {
                return 0.0;
            }
        }
    }

}

class IPhone extends RechargableEquipment {

    public IPhone() {
        this.name = "IPHONE";
        this.POWER_CAPAICITY = 4.0;
    }

    public void charge() {
        adapter = new Adapter(this);
        super.charge();
    }
}

class ICOM extends RechargableEquipment {

    public ICOM() {
        this.name = "ICOME";
        this.POWER_CAPAICITY = 12.0;
    }

    @Override
    public void charge() {
        adapter = new Adapter(this);
        super.charge();
    }

}

class ColorTV extends ACEquipment {
    public ColorTV() {
        this.name = "Color TV";
        adapter = new Adapter(this);
    }

    public void play(String station) {
        super.operate("Playing station "+ station);
    }
 
    
}