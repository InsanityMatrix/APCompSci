/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayliststudents;

/**
 *
 * @author davidpiedra
 */
public class Student {
    private String firstName, lastName;
    private int grade;
    
    public Student(String fName, String lName, int grade) {
        this.firstName = fName;
        this.lastName = lName;
        this.grade = grade;
    }
    public Student(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + ", Grade: " + this.grade;
    }
}