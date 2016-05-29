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
public class BridgePatternDemo {

    public static void main(String[] args) {
        QuestionFormat questionFormat
                = new QuestionFormat("Java Programming Language");

        questionFormat.questions = new JavaQuestions();
        questionFormat.delete("What is class?");
        questionFormat.display();
        
        questionFormat.newOne("What is inheritance");
        questionFormat.newOne("How many type of inheritance "
                + "are there in java?");
        
        questionFormat.displayAll();
        
    }
}
