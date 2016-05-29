/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.ch4.builderpattern.kidfastfood;

/**
 * Concrete Class
 */
public class Drink {

    private String flavor;

    public Drink(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Drink{" + "flavor=" + flavor + '}';
    }

}
