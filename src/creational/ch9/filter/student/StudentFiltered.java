/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.ch9.filter.student;

import java.util.List;

/**
 *
 * @author vichet
 */
public interface StudentFiltered {
    public List<Student> applyFilter(List<Student> allStudents);
}
