/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.ch9.filter.student;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vichet
 */
public class StudentTest {
    
    public static void printStudent(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kosal", "Male", "Single"));
        students.add(new Student("Piseth", "Male", "Single"));        
        students.add(new Student("Chanthou", "Female", "Single"));
        students.add(new Student("Bopha", "Female", "Single"));
        students.add(new Student("Meymey", "Female", "Married"));        
        students.add(new Student("Koko", "Male", "Married"));        
        printStudent(students);
        
        System.out.println("------------------------");
        
        NameFilteredStudent studentFiltered = new NameFilteredStudent();
        studentFiltered.setFilter("th");
        List<Student> std = studentFiltered.applyFilter(students);
        printStudent(std);
        
        
    }
}
