/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.ch3.singletonpattern.simple;

/**
 *
 * @author vichet
 */
public class SingletonExample {
    
    
    public static void main(String[] args) {
        
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        
        
    }
}
