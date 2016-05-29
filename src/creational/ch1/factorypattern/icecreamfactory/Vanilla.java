package creational.ch1.factorypattern.icecreamfactory;

/**
 * @author vichet
 * @version 1.0
 * @created 02-Mar-2014 3:47:57 PM
 */
public class Vanilla extends IceCream {

    public Vanilla(double price) {
        super(price);
    }

    @Override
    public void printBill() {
        System.out.println("Vanilla{Price: " + super.getPrice() + "}");
    }

}
