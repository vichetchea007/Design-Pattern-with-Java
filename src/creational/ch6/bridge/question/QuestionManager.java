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
public class QuestionManager {
    protected Question questions;
    public String catalog;

    public QuestionManager(String catalog) {
        this.catalog = catalog;
    }
    
    public void next() {
        questions.nextQuestion();
    }
    
    public void previous() {
        questions.peviousQuestion();
    }
    
    public void newOne(String q) {
        questions.newQuestion(q);
    }
    
    public void delete(String q) {
        questions.deleteQuestion(q);
    }
    
    public void display(){
        questions.displayQuestion();
    }
    
    public void displayAll() {
        System.out.println("Question Papaer : " + this.catalog);
        questions.displayAllQuestions();
    }
}
