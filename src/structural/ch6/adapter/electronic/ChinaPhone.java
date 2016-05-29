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
public class ChinaPhone extends MobilePhone {

    public ChinaPhone() {
        super("China Phone", 4.0, 0.0);
        super.adapter = new PowerAdapter(this);
    }
    
    public void charge(){
        super.usePower();
    }
    
}
