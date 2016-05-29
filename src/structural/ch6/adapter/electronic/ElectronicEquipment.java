/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.ch6.adapter.electronic;

/**
 *
 * @author vichet
 */
public abstract class ElectronicEquipment {
    
    protected PowerAdapter adapter;
    protected String name;

    public String getName() {
        return name;
    }
        
    protected abstract void usePower();
}
