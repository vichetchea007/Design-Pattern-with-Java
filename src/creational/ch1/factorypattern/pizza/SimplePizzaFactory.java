package creational.ch1.factorypattern.pizza;

/**
 * @author vichet
 * @version 1.0
 * @created 13-Feb-2014 11:34:36 AM
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("peperoni")) {
            pizza = new PeperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}//end SimplePizzaFactory
