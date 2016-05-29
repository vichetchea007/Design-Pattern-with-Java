/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.ch6.bridge.question;

import java.util.ArrayList;
import java.util.List;
import static java.util.concurrent.ThreadLocalRandom.current;

/**
 *
 * @author vichet
 */
public class JavaQuestions implements Question {

    private List<String> questions = new ArrayList<String>();
    private int current = 0;
    
    public JavaQuestions() {
        questions.add("What is class?");
        questions.add("What is interface");
        questions.add("What is abstraction? ");
        questions.add("How multiple polymorphism is achieved in java? ");
        questions.add("How many types of exception  handling are there in java? ");
        questions.add("Define the keyword final for  variable, method, and class in java? ");
        questions.add("What is abstract class? ");
        questions.add("What is multi-threading? ");

    }

    @Override
    public void nextQuestion() {
        if (current <= questions.size() - 1) {
            current++;
            System.out.println(current);
        }
    }

    @Override
    public void peviousQuestion() {
        if (current > 0) {
            current--;
        }
    }

    @Override
    public void newQuestion(String question) {
        questions.add(question);
    }

    @Override
    public void deleteQuestion(String question) {
        questions.remove(question);
    }

    @Override
    public void displayQuestion() {
        System.out.println(questions.get(current));
    }

    @Override
    public void displayAllQuestions() {
        for (String question : questions) {
            System.out.println(question);
        }
    }

}
