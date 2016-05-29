package creational.ch2.abstractfactory.shapeandcolor;

import creational.ch2.abstractfactory.shapeandcolor.shape.Shape;
import creational.ch2.abstractfactory.shapeandcolor.color.Color;

/**
 * @author vichet
 * @version 1.0
 * @created 28-Feb-2014 10:14:51 AM
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shapeType);

    public abstract Color getColor(String colorType);
}
