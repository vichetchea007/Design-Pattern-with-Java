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
public class SimpleRoom implements Room {

    @Override
    public String showRoom() {
        return "Normal Room";
    }    
}


