/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.ch6.adapter.electronic;

/**
 *
 * @author vichet
 */
public class PowerAdapter extends WallSocket {

    private ElectronicEquipment ee;

    public PowerAdapter(ElectronicEquipment ee) {
        this.ee = ee;
    }
    
    public double getPower() {
        if (isOFF()) {
            return 0.0;
        } else if (ee instanceof IPHONE) {
            return 0.10;
        } else if (ee instanceof ChinaPhone) {
            return 0.20;
        } else {
            return super.getPowerOutput();
        }

    }
}
