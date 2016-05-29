package creational.ch1.factorypattern.pizza;

/**
 * @author vichet
 * @version 1.0
 * @created 13-Feb-2014 11:40:08 AM
 */
public class PizzaStore {

    

    public Pizza orderPizza(String type) {
        
        SimplePizzaFactory factory = new SimplePizzaFactory();        
        Pizza pizza;
        
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }

}//end PizzaStore
