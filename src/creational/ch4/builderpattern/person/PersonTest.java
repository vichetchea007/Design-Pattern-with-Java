/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.ch4.builderpattern.person;

/**
 *
 * @author vichet
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setFirstname("Dara")
                .setLastname("Sok")
                .setAge(20)
                .setAddress("#123, Street 345")
                .build();
        
        System.out.println(person);
        
    }
}
