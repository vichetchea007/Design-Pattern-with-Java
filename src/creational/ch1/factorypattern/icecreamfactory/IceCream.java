package creational.ch1.factorypattern.icecreamfactory;

/**
 * @author vichet
 * @version 1.0
 * @created 02-Mar-2014 3:47:57 PM
 */
public abstract class IceCream {

    private double price;

    public IceCream(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
    
    public abstract void printBill();
}


