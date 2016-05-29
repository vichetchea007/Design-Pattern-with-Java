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
public class IPHONE extends MobilePhone {

    public IPHONE() {
        super("Iphone", 4.0, 0.0);
        super.adapter = new PowerAdapter(this);
    }
    
    public void charge() {
        super.usePower();
    }
    
}
