package creational.ch2.abstractfactory.cpufactory;

/**
 * @author vichet
 * @version 1.0
 * @created 21-Mar-2014 5:30:39 PM
 */
public class FactoryProducer {

    public static CPUFactory getFactory(FactoryName factoryName) {
        switch (factoryName) {
            case AMD:
                return new AMDFactory();
            case INTEL:
                return new IntelFactory();
            default:
                throw new IllegalArgumentException("Invalide Factory Name");
        }
    }
}


