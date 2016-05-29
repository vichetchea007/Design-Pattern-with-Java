package creational.ch2.abstractfactory.shapeandcolor;

import creational.ch2.abstractfactory.shapeandcolor.color.Color;
import creational.ch2.abstractfactory.shapeandcolor.shape.Shape;

/**
 * @author vichet
 * @version 1.0
 * @created 28-Feb-2014 9:54:11 AM
 */
public class AbstractFactoryDemo {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Cirlce
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //Exercise get an object of Shape Rectangle, and Square
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        
        
        // when invalid type
        AbstractFactory invalidFactory = FactoryProducer.getFactory("Dinosor");

        // when invalid shape
        Shape invalidShape = shapeFactory.getShape("Oval");

        // when invalid color
        Color invalidColor = colorFactory.getColor("Blank");

        // when call getColor() from shapeFactory instance
        Color unsupportedColor = shapeFactory.getColor("RED");

        // when call getShape() from colorFactory instance
        Shape unsupportedShape = colorFactory.getShape("CIRCLE");

    }
}//end AbstractFactoryDemo
