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
public class Square extends Shape {

    public Square() {
        super.type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("In Square::draw() method");
    }

}
