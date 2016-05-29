package creational.ch2.abstractfactory.shapeandcolor.shape;

/**
 * @author vichet
 * @version 1.0
 * @created 28-Feb-2014 9:54:11 AM
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}


