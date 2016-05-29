package creational.ch2.abstractfactory.shapeandcolor.color;

/**
 * @author vichet
 * @version 1.0
 * @created 28-Feb-2014 9:54:12 AM
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}



