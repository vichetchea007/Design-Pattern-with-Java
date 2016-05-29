/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.ch6.adapter.cardreader;

import java.util.ArrayList;

/**
 *
 * @author vichet
 */
public class MicroSDCard extends Memory {

    public MicroSDCard() {
        super.cardName = "Micro SD Card";
    }

    public MicroSDCard(String label) {
        super.cardName = label;
    }

}
