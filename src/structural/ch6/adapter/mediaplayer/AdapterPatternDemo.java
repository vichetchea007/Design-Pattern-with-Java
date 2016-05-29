/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.ch6.adapter.mediaplayer;

/**
 *
 * @author vichet
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("mp3", "Sneha Knong Pel Reatrey");
        audioPlayer.play("mp4", "Spiderman X");
        audioPlayer.play("vlc", "Tom and Jerry");
        audioPlayer.play("avi", "Mr. Bean");
    }
    
}
