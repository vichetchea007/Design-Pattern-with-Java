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
public class ShapeFactory {

    /**
     * use getShape method to get object to type shape
     */
    public Shape getShape(String shapeType) {

        switch (shapeType.toUpperCase()) {
            case "CIRCLE":
                return new Circle();

            case "SQUARE":
                return new Square();

            case "RECTANGLE":
                return new Rectangle();

            default:
                return null;
        }

    }

}

