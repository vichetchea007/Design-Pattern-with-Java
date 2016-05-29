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
public class TestingSwitch {
    public static void main(String[] args) {
        
        Switchable fan = new Fan();
        
        Switch s = new Switch();
        s.equipment = fan;
        s.on();
        
    }
}
