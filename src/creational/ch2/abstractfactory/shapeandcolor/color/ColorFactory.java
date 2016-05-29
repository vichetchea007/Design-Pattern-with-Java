package creational.ch2.abstractfactory.shapeandcolor.color;

import creational.ch2.abstractfactory.shapeandcolor.AbstractFactory;
import creational.ch2.abstractfactory.shapeandcolor.shape.Shape;

/**
 * @author vichet
 * @version 1.0
 * @created 28-Feb-2014 9:54:12 AM
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType) {
        if (colorType.equals("RED")) {
            return new Red();
        } else if (colorType.equals("GREEN")) {
            return new Green();
        } else if (colorType.equals("BLUE")) {
            return new Blue();
        } else {
            throw new IllegalArgumentException(colorType
                    + " is invalid Color.");
        }
    }

    @Override
    public Shape getShape(String shapeType) {
        throw new UnsupportedOperationException(
                "getShape() is not supported yet.");
    }

}

