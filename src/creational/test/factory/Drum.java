/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.test.factory;

/**
 *
 * @author vichet
 */
public class Drum extends Instrument{

    public Drum(String name) {
        super(name);
    }

    
    @Override
    public void speak() {
        System.out.println(this.getName() + "'s sound: Toong toong...");
    }
}
