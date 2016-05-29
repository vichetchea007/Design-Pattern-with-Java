package creational.ch4.builderpattern.pizza;

/**
 * "A Customer order an pizza"
 */
public class BuilderExample {

    public static void main(String[] args) {
        
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiiPizzaBuilder = new HawaiiPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        
        waiter.setPizzaBuilder(hawaiiPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza1 = waiter.getPizza();        
        System.out.println(pizza1);
                
        // Write your own code to make a Spicy Pizza here
                
    }
}

