/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.ch6.adapter.cardreader;

import java.util.List;

/**
 *
 * @author vichet
 */
public class Computer {

    private CardReader cardReader;

    public void setCardReader(CardReader cardReader) {
        this.cardReader = cardReader;
    }

    public void writeFileToMemory(String fileName) {
        this.cardReader.getMemory().getFiles().add(fileName);
    }

    public void showFileListFromMemory() {

        if (this.cardReader.getMemory() == null) {
            System.out.println("Please put a memory in the Card Reader");
        } else {
            System.out.println("----------------------------------------");
            System.out.println(this.cardReader.getMemory().getCardName());
            System.out.println("----------------------------------------");
            List<String> files = this.cardReader.getMemory().getFiles();
            for (String file : files) {
                System.out.println(file);
            }
            System.out.println("----------------------------------------");
        }
    }

}
