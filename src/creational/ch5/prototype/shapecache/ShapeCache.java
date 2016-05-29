/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.ch5.prototype.shapecache;

import java.util.Hashtable;

/**
 *
 * @author vichet
 */
public class ShapeCache {

    
    private static Hashtable<String, Shape> shapMap = 
            new Hashtable<String, Shape>();
    
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    
    public static void loadCache() {
        
        Circle circle = new Circle();
        circle.setId("1");
        shapMap.put(circle.getId(), circle);
        
        Square square = new Square();
        square.setId("2");
        shapMap.put(square.getId(), square);
        
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapMap.put(rectangle.getId(), rectangle);
        
    }
}
