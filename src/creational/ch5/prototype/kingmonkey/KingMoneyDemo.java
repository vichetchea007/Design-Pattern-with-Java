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
public class KingMoneyDemo {

    public static void main(String[] args) 
            throws CloneNotSupportedException {

        KingMonkey wukong = new KingMonkey();

        KingMonkey monkey1 = wukong.clone();
        monkey1.transform("Paje");

        KingMonkey monkey2 = wukong.clone();
        monkey2.transform("Thang Zeng");

        KingMonkey monkey3 = monkey2.clone();
        monkey3.transform("Spider Evil");

        System.out.println(wukong);
        System.out.println(monkey1);
        System.out.println(monkey2);
        System.out.println(monkey3);

        // but, these are the same
        KingMonkey monkey4 = wukong.clone();
        monkey4.transform("King of Cow");

        KingMonkey monkey5 = monkey4;
        monkey5.transform("Yang Zian");

        System.out.println(monkey4);
        System.out.println(monkey5);

    }

}
