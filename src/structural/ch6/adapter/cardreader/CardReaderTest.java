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
public class CardReaderTest {
    public static void main(String[] args) {
        
        
        MicroSDCard sd1 = new MicroSDCard("MP3 Memory");
        CardReader cr = new CardReader();
        cr.setMemory(sd1);
        
        Computer computer = new Computer();
        computer.setCardReader(cr);
        
        computer.writeFileToMemory("Song 1.mp3");
        computer.writeFileToMemory("Song 2.mp3");
        computer.writeFileToMemory("Song 3.mp3");
        
        MicroSDCard sd2 = new MicroSDCard("MP4 Memory");
        cr.setMemory(sd2);
        
        computer.writeFileToMemory("Movie 1.mp4");
        computer.writeFileToMemory("Movie 2.mp4");
        computer.writeFileToMemory("Movie 3.mp4");
        
        computer.showFileListFromMemory();
        cr.setMemory(sd1);
        cr.removeMemory();
        computer.showFileListFromMemory();
        
    }
}
