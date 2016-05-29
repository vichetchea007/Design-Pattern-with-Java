/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.ch1.factorypattern.shape;

/**
 *
 * @author vichet
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        
        ShapeFactory shapeFactory = new ShapeFactory();
        
        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();  // call draw metho of Circle
        
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();        
        
    }
        
}
