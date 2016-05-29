/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.ch6.adapter.electronic;

import java.text.DecimalFormat;

/**
 *
 * @author vichet
 */
public class MobilePhone extends ElectronicEquipment {

    protected double POWER_CAPACITY;
    protected double power;

    public MobilePhone(String name, double POWER_CAPACITY, double power) {
        super.name = name;
        this.POWER_CAPACITY = POWER_CAPACITY;
        this.power = power;
    }

    @Override
    protected void usePower() {
        Runnable thread = new Runnable() {

            @Override
            public void run() {
                double chargingPower = adapter.getPower();

                if (chargingPower == 0) {
                    System.out.println("No Power!, "
                            + getName() + " can not be charged.");
                } else {
                    try {
                        while (power < POWER_CAPACITY) {
                            power += adapter.getPower();
                            System.out.println(getName() + " is charging : "
                                    + new DecimalFormat("0.00").format(power));
                            Thread.sleep(10);
                        }
                        System.out.println(getName()
                                + "'s battery is fully charged");

                    } catch (InterruptedException e) {

                    }
                }
            }
        };
        thread.run();
    }

}
