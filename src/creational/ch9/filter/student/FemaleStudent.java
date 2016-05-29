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
public class FemaleStudent implements StudentFiltered {

    @Override
    public List<Student> applyFilter(List<Student> allStudents) {
        List<Student> femaleStudents = new ArrayList<>();
        for (Student student : allStudents) {
            if (student.getGender().equalsIgnoreCase("female")) {
                femaleStudents.add(student);
            }
        }
        
        return femaleStudents;
    }
    
}
