package creational.ch4.builderpattern.pizza;

/**
 * "Director"
 */
public class Waiter {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return this.pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.prepareNewPizza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();        
    }
}

