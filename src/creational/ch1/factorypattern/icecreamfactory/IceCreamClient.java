package creational.ch1.factorypattern.icecreamfactory;

/**
 * @author vichet
 * @version 1.0
 * @created 02-Mar-2014 3:47:57 PM
 */
public class IceCreamClient {

    public static void main(String[] args) {

        IceCream iceCream1 = IceCreamFactory.getIceCream("STRAWBERRY");
        iceCream1.printBill();

        IceCream iceCream2 = IceCreamFactory.getIceCream("VANILLA");
        iceCream2.printBill();

        IceCream iceCream3 = IceCreamFactory.getIceCream("CHOCOLATE");
        iceCream3.printBill();

     //   IceCream iceCream4 = IceCreamFactory.getIceCream("APPLE");
     //   iceCream4.printBill();
    }
}

