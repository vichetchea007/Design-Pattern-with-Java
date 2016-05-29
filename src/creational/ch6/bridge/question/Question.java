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
public interface Question {
    public void nextQuestion();
    public void peviousQuestion();
    public void newQuestion(String question);
    public void deleteQuestion(String question);
    public void displayQuestion();
    public void displayAllQuestions();
}
