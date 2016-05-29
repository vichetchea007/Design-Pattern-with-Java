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
public class ColorTV extends ElectronicEquipment {

    public ColorTV() {
        super.name = "Color TV";
        super.adapter = new PowerAdapter(this);
    }

    @Override
    protected void usePower() {
        System.out.println(super.getName() 
                +" use "+ super.adapter.getPower());
    }
    
    public void play(String station) {
        System.out.println("Playing station : "+ station);
    }
    
    
}
