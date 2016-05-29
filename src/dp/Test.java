/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dp;

import java.awt.Point;

/**
 *
 * @author vichet
 */
public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = p1;
        p2.setLocation(3,4);
        
        Point p3 = (Point) p2.clone();
        p3.setLocation(5, 6);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
    }
            
}
