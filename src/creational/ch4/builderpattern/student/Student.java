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
public class Student {

    private String firstname;   // required
    private String lastname;    // required
    private int age;            // optional
    private String phone;       // optional
    private String address;     // optional

    private Student() {
    }

    private Student(StudentBuilder builder) {
        this.setFirstname(builder.build().getFirstname());
        this.setLastname(builder.build().getLastname());
        this.setAge(builder.build().getAge());
        this.setAddress(builder.build().getAddress());
        this.setPhone(builder.build().getPhone());
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" 
                + "firstname=" + firstname 
                + ", lastname=" + lastname 
                + ", age=" + age 
                + ", phone=" + phone 
                + ", address=" + address 
                + '}';
    }

    public static class StudentBuilder {

        private Student student = new Student();

        public StudentBuilder setFirstname(String firstname) {
            student.setFirstname(firstname);
            return this;
        }

        public StudentBuilder setLastname(String lastname) {
            student.setLastname(lastname);
            return this;
        }

        public StudentBuilder setAge(int age) {
            student.setAge(age);
            return this;
        }

        public StudentBuilder setPhone(String phone) {
            student.setPhone(phone);
            return this;
        }

        public StudentBuilder setAddress(String address) {
            student.setAddress(address);
            return this;
        }

        public Student build() {
            return this.student;
        }

    }
}
