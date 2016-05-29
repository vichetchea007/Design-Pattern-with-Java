package creational.ch2.abstractfactory.shapeandcolor.shape;

import creational.ch2.abstractfactory.shapeandcolor.AbstractFactory;
import creational.ch2.abstractfactory.shapeandcolor.color.Color;

/**
 * @author vichet
 * @version 1.0
 * @created 28-Feb-2014 9:54:12 AM
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        } else {
            throw new IllegalArgumentException(shapeType 
                    + " is invalid shape.");
        }
    }

    @Override
    public Color getColor(String colorType) {
        throw new UnsupportedOperationException(
                "getColor() is not supported yet.");
    }

}


