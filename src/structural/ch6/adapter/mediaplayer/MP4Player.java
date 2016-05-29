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
public class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void palyMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

}
