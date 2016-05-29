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
public class Singleton {

    private static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
            System.out.println("A new Singleton instance is created!");
        } else {
            System.out.println("An existing Singleton instance is used!");
        }
        return singleton;
    }

    private Singleton() {
    }

}

