/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.ch4.builderpattern.kidfastfood;

public class KidFastFoodBuilder {

    public static KidFastFood getKidFastFood(int suit) {

        KidFastFood kidFastFood = new KidFastFood();

        switch (suit) {
            case 1:
                kidFastFood.setBurger(new Burger("Chicken Burger"));
                kidFastFood.setDrink(new Drink("Coke"));
                kidFastFood.setDonut(new Donut("Chocolate"));
                kidFastFood.setToy(new Toy("Car"));
                kidFastFood.setPrice(2.5);
                break;
            case 2:
                kidFastFood.setBurger(new Burger("Beef Burger"));
                kidFastFood.setDrink(new Drink("Pepsi"));
                kidFastFood.setDonut(new Donut("Milk"));
                kidFastFood.setToy(new Toy("Motor"));
                kidFastFood.setPrice(2.8);
                break;
            default:
                kidFastFood.setBurger(new Burger("Fish Burger"));
                kidFastFood.setDrink(new Drink("7up"));
                kidFastFood.setDonut(new Donut("Sugar"));
                kidFastFood.setToy(new Toy("Robot"));
                kidFastFood.setPrice(3.0);
                break;
        }
        return kidFastFood;
    }
}
