/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.ch6.adapter.cardreader;

/**
 *
 * @author vichet
 */
public class CardReader {
    private Memory memory;

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
    
    public void removeMemory() {
        setMemory(null);
    }
    
}
