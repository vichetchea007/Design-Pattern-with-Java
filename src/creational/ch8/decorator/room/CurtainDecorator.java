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
public class CurtainDecorator extends RoomDecorator {

    public CurtainDecorator(Room specialRoom) {
        super(specialRoom);
    }

    @Override
    public String showRoom() {
        return super.showRoom() + addCurtains(); 
    }
    
    public String addCurtains() {
        return " + Red Curtains";
    }
    
}
