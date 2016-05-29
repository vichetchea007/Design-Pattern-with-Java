/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.ch4.builderpattern.kidfastfood;

/**
 * Concrete Class
 */
public class Toy {

    private String toyType;

    public Toy(String toyType) {
        this.toyType = toyType;
    }

    @Override
    public String toString() {
        return "Toy{" + "toyType=" + toyType + '}';
    }

}
