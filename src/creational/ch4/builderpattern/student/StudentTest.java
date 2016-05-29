/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.ch4.builderpattern.student;

/**
 *
 * @author vichet
 */
public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student.StudentBuilder()
                .setFirstname("Sok")
                .setLastname("Sen")
                .setAge(30)
                .setAddress("Sangkat Sen Sok")
                .build();

        System.out.println(student1);
    }

}
