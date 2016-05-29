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
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void palyMp4(String fileName) {
        // do nothing
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }
    
}
