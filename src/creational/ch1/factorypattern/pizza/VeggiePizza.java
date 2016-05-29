package creational.ch1.factorypattern.pizza;

/**
 * @author vichet
 * @version 1.0
 * @created 13-Feb-2014 11:17:10 AM
 */
public class VeggiePizza implements Pizza {

    public VeggiePizza() {
        System.out.println("Veggie Pizza");
        System.out.println("-------------");
    }

    public void prepare() {
        System.out.println("Veggie Pizza is preparing...");
    }

    public void bake() {
        System.out.println("Veggie Pizza is baking...");
    }

    public void cut() {
        System.out.println("Veggie Pizza is cutting...");
    }

    public void box() {
        System.out.println("Veggie Pizza is ready to delivered.");
    }
}//end VeggiePizza
