/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.ch6.adapter.cardreader;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vichet
 */
public class Memory {

    protected String cardName;
    protected List<String> files = new ArrayList<String>();

    public String getCardName() {
        return cardName;
    }

    public List<String> getFiles() {
        return files;
    }

}
