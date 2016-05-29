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
public class Circle extends Shape {

    public Circle() {
        super.type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("In Circle::draw() method");
    }
    
    
}
