/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.ch4.builderpattern.kidfastfood;

/**
 *
 * @author vichet
 */
public class Cashier {

    public KidFastFood orderKidFastFood(int suit) {
        return KidFastFoodBuilder.getKidFastFood(suit);
    }

}
