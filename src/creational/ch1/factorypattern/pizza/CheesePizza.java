package creational.ch1.factorypattern.pizza;

/**
 * @author vichet
 * @version 1.0
 * @created 13-Feb-2014 11:16:58 AM
 */
public class CheesePizza implements Pizza {

    public CheesePizza() {
        System.out.println("Cheese Pizza");
        System.out.println("------------");
    }

    public void prepare() {
        System.out.println("Cheese Pizza is preparing...");
    }

    public void bake() {
        System.out.println("Cheese Pizza is baking...");
    }

    public void cut() {
        System.out.println("Cheese Pizza is cutting...");
    }
    
    public void box() {
        System.out.println("Cheese Pizza is ready to delivered.");
    }

  

}//end CheesePizza
