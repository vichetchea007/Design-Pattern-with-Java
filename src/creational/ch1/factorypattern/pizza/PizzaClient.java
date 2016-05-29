package creational.ch1.factorypattern.pizza;

/**
 * @author vichet
 * @version 1.0
 * @created 13-Feb-2014 11:34:40 AM
 */
public class PizzaClient {

    public static void main(String[] args) {
        
        PizzaStore pizzaStore = new PizzaStore();
        
        Pizza pizza1 = pizzaStore.orderPizza("cheese");
        System.out.println("");
        
        Pizza pizza3 = pizzaStore.orderPizza("peperoni");
        System.out.println("");
        
    }
}//end PizzaClient

