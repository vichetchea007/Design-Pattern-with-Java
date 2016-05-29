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
public class CDDemo {

    public static void main(String[] args) throws Exception {
        CD cd1;
        CD cd2;
        CD cd3;

        cd1 = new CD("RHM Vol. 1");

        cd1.addSong(new Song("Sneha Knong Pel Reatrey", "Srey Leak", 4));
        cd1.addSong(new Song("Chet Prey Psay", "Prep Sovath", 3));

        cd2 = cd1;
        cd2.addSong(new Song("Niymney Sne", "Sapun", 5));

        cd3 = (CD) cd1.clone();
        cd3.setAlbum("RHM Collection");
        cd3.addSong(new Song("Propun Si Seang", "Perk My", 10));
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
    }
}
