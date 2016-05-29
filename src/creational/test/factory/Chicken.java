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
public class Chicken extends Bird{
   

    public Chicken(String name) {
        super(name);
    }

    
    @Override
    public void speak() {
        System.out.println(this.getName() + "'s sound: O o o o...");
    }
}
