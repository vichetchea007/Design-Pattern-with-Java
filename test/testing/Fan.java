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
public class Fan implements Switchable {

    @Override
    public void powerOn() {
        System.out.println("Fan is switched ON");
    }

    
    
    @Override
    public void powerOff() {
        System.out.println("Fan is swithced OFF");
    }
    
}
