package creational.ch1.factorypattern.icecreamfactory;

/**
 * @author vichet
 * @version 1.0
 * @created 02-Mar-2014 3:47:57 PM
 */
public class Chocolate extends IceCream {

    public Chocolate(double price) {
        super(price);
    }

    @Override
    public void printBill() {
        System.out.println("Chocolate{+ Price: " + super.getPrice() + "}");
    }

}

