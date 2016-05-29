package creational.ch1.factorypattern.pizza;

/**
 * @author vichet
 * @version 1.0
 * @created 13-Feb-2014 11:16:58 AM
 */
public class ClamPizza implements Pizza {

    public ClamPizza() {
        System.out.println("Clam Pizza");
        System.out.println("----------");
    }

    public void prepare() {
        System.out.println("Clam Pizza is preparing...");
    }

    public void bake() {
        System.out.println("Clam Pizza is baking...");
    }

    public void cut() {
        System.out.println("Clam Pizza is cutting...");
    }

    public void box() {
        System.out.println("Clam Pizza is ready to delivered.");
    }
}//end ClamPizza
