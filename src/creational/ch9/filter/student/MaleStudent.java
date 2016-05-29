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
public class MaleStudent implements StudentFiltered {

    @Override
    public List<Student> applyFilter(List<Student> allStudents) {
        List<Student> maleStudents = new ArrayList<>();
        for (Student student : allStudents) {
            if (student.getGender().equalsIgnoreCase("male")) {
                maleStudents.add(student);
            }
        }
        
        return maleStudents;
        
    }
    
}
