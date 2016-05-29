package creational.ch2.abstractfactory.shapeandcolor;

import creational.ch2.abstractfactory.shapeandcolor.shape.ShapeFactory;
import creational.ch2.abstractfactory.shapeandcolor.color.ColorFactory;

/**
 * @author vichet
 * @version 1.0
 * @created 28-Feb-2014 9:54:12 AM
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {

        if (factoryType.equals("COLOR")) {
            return new ColorFactory();
        } else if (factoryType.equals("SHAPE")) {
            return new ShapeFactory();
        } else {
            throw new IllegalArgumentException(
                    factoryType + " in invalid factory type.");
        }

    }
}

