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
public class WallSocket {
    
    private double powerOutput = 220;
    private static boolean isOFF = true;

    public double getPowerOutput() {
        if (isOFF()) {
            return 0.0;
        } else {
            return powerOutput;
        }
    }

    public static boolean isOFF() {
        return isOFF;
    }
    
    public static void ON() {
        isOFF = false;
    }
    
    public static void OFF() {
        isOFF = true;
    }
    
}
