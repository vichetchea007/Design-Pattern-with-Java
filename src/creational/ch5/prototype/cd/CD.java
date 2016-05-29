/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.ch5.prototype.cd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vichet
 */
public class CD implements Cloneable {

    public final int CAPACITY = 70; // 70minutes

    private List<Song> songs = new ArrayList<Song>();
    private String album;
    private int totalDuration;

    public CD(String album) {
        this.album = album;
    }

    public void addSong(Song song) throws Exception {
        if (totalDuration + song.getDuration() > CAPACITY) {
            throw new Exception("Disk is not enough space.");
        } else {
            totalDuration += song.getDuration();
            songs.add(song);
        }
    }

    @Override
    protected CD clone() throws CloneNotSupportedException {
        CD cd = (CD) super.clone();
        cd.setSongs(new ArrayList<Song>(this.getSongs()));
        return cd;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

    @Override
    public String toString() {
        String str = "";
        str += "CAPCITY: " + this.CAPACITY + "\n";
        str += "Album  : " + this.getAlbum() + "\n";
        int i = 0;
        for (Song song : songs) {
            i++;
            str += i + " - " + song.getTitle()
                    + ", by " + song.getSinger()
                    + ", " + song.getDuration() + " mn \n";

        }
        return str;
    }

}
