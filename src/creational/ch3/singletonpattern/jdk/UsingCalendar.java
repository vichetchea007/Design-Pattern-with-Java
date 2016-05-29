/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.ch3.singletonpattern.jdk;

import java.util.Calendar;

/**
 *
 * @author vichet
 */
public class UsingCalendar {
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}
