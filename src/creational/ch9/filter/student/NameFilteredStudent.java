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
public class NameFilteredStudent implements StudentFiltered {

    private String name;
    public void setFilter(String name) {
        this.name = name;
    }
    
    @Override
    public List<Student> applyFilter(List<Student> allStudents) {
        List<Student> std = new ArrayList<>();
        for (Student student : allStudents) {
            if (student.getName().contains(this.name)) {
                std.add(student);
            }
        }
        
        return std;
        
    }
    
}
