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
public abstract class RoomDecorator implements Room {
    
    protected Room specialRoom;
    
    public RoomDecorator(Room specialRoom) {
        this.specialRoom = specialRoom;
    }

    @Override
    public String showRoom() {
        return specialRoom.showRoom();
    }
    
    
}
