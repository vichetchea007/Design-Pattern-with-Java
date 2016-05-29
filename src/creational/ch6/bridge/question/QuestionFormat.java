/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.ch6.bridge.question;

/**
 *
 * @author vichet
 */
public class QuestionFormat extends QuestionManager {

    public QuestionFormat(String catalog) {
        super(catalog);
    }

    @Override
    public void displayAll() {
        System.out.println("\n---------------------------------");
        super.displayAll(); 
        System.out.println("\n---------------------------------");
    }
    
    
}
