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
public class AdapterTest {

    public static void main(String[] args) {

        WallSocket.OFF();
        IPHONE iphone = new IPHONE();
        iphone.charge();

        
         ChinaPhone chinaPhone = new ChinaPhone();
         chinaPhone.usePower();
        
         ColorTV tv = new ColorTV();
         tv.usePower();
         tv.play("CNN");
         
    }
}
