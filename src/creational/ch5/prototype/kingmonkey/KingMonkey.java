/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.ch5.prototype.kingmonkey;

/**
 *
 * @author vichet
 */
public class KingMonkey implements Cloneable {

    private String currentStatus = "Monkey";

    @Override
    protected KingMonkey clone() throws CloneNotSupportedException {
        return (KingMonkey) super.clone();
    }

    public void transform(String status) {
        this.currentStatus = status;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    @Override
    public String toString() {
        return "KingMonkey{" + "currentStatus=" + currentStatus + '}';
    }

}
