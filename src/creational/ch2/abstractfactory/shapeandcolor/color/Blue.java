package creational.ch2.abstractfactory.shapeandcolor.color;

/**
 * @author vichet
 * @version 1.0
 * @created 28-Feb-2014 9:54:11 AM
 */
public class Blue implements Color {

	@Override
	public void fill(){
            System.out.println("Inside Blue::fill() method.");
	}
}

