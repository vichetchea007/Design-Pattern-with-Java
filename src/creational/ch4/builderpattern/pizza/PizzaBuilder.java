package creational.ch4.builderpattern.pizza;

/**
 * "Abstract Builder"
 */
public abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return this.pizza;
    }

    public void prepareNewPizza() {
        pizza = new Pizza();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();

}

