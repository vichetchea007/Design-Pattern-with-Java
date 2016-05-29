/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.ch4.builderpattern.kidfastfood;

/**
 * A "Product" Class
 */
public class KidFastFood {

    private Burger burger;
    private Donut donut;
    private Drink drink;
    private Toy toy;
    private double price;

    @Override
    public String toString() {
        return "KidFastFood { "
                + "\n\t - burger = " + burger
                + "\n\t - donut = " + donut
                + "\n\t - drink = " + drink
                + "\n\t - toy = " + toy
                + "\n\t - price = " + price
                + "\n}";
    }

    public Burger getBurger() {
        return burger;
    }
    public void setBurger(Burger burger) {
        this.burger = burger;
    }
    public Donut getDonut() {
        return donut;
    }
    public void setDonut(Donut donut) {
        this.donut = donut;
    }
    public Drink getDrink() {
        return drink;
    }
    public void setDrink(Drink drink) {
        this.drink = drink;
    }
    public Toy getToy() {
        return toy;
    }
    public void setToy(Toy toy) {
        this.toy = toy;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
