/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.ch5.prototype.cd;

/**
 *
 * @author vichet
 */
public class Song  {
    
    private String singer;
    private String title;
    private int duration;

    public Song(String singer, String title, int size) {
        this.singer = singer;
        this.title = title;
        this.duration = size;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" + "singer=" + singer + ", title=" + title + ", size=" + duration + '}';
    }
    
    
}
