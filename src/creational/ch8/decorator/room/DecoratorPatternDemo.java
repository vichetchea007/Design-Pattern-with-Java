/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.ch8.decorator.room;

/**
 *
 * @author vichet
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Room room = new SimpleRoom();
        System.out.println(room.showRoom());
        
    }
}
