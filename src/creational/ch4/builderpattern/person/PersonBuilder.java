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
public class PersonBuilder {
    
    Person person = new Person();
    
    public PersonBuilder setFirstname(String firstname) {
        person.setFirstname(firstname);
        return this;
    }
    
    public PersonBuilder setLastname(String lastname) {
        person.setLastname(lastname);
        return this;
    }
    
    public PersonBuilder setAge(int age) {
        person.setAge(age);
        return this;
    }
    
    public PersonBuilder setAddress(String address) {
        person.setAddress(address);
        return this;
    }
    
    public PersonBuilder setPhone(String phone) {
        person.setPhone(phone);
        return this;
    }
    
    public Person build() {
        return this.person;
    }
}
