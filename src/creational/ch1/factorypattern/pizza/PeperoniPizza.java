package creational.ch1.factorypattern.pizza;

/**
 * @author vichet
 * @version 1.0
 * @created 13-Feb-2014 11:17:10 AM
 */
public class PeperoniPizza implements Pizza {

    public PeperoniPizza() {
        System.out.println("Peperoni Pizza");
        System.out.println("---------------");
    }

    public void prepare() {
        System.out.println("Peperoni Pizza is preparing...");
    }

    public void bake() {
        System.out.println("Peperoni Pizza is baking...");
    }

    public void cut() {
        System.out.println("Peperoni Pizza is cutting...");
    }

    public void box() {
        System.out.println("Peperoni Pizza is ready to delivered.");
    }
}//end PeperoniPizza
