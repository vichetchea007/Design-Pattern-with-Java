package creational.ch1.factorypattern.icecreamfactory;

/**
 * @author vichet
 * @version 1.0
 * @created 02-Mar-2014 3:47:57 PM
 */
public class IceCreamFactory {

    public static IceCream getIceCream(String flavorType) {
        if (flavorType.equals("STRAWBERRY")) {
            return new Strawberry(1.50);
        } else if (flavorType.equals("VANILLA")) {
            return new Vanilla(1.25);
        } else if (flavorType.equals("CHOCOLATE")) {
            return new Chocolate(2.50);
        } else {
            throw new IllegalArgumentException("Sorry! IceCream Factory "
                    + "does not have " + flavorType + " flavor.");
        }
    }
}

