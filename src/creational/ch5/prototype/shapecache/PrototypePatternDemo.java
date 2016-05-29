/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.ch5.prototype.shapecache;

/**
 *
 * @author vichet
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        
        ShapeCache.loadCache();
        
        Shape shape1 = ShapeCache.getShape("1");
        Shape shape2 = ShapeCache.getShape("2");
        Shape shape3 = ShapeCache.getShape("3");
        
        System.out.println("Shape1 : "+ shape1.getType());
        System.out.println("Shape2 : "+ shape2.getType());
        System.out.println("Shape3 : "+ shape3.getType());
    }
    
}


