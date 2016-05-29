/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;

/**
 *
 * @author vichet
 */
public class Switch {
    public Switchable equipment;
    
    public void on() {
        equipment.powerOn();
    }
    
    public void off(){
        equipment.powerOff();
    }
}
