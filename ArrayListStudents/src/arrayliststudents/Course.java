/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayliststudents;

import java.util.ArrayList;

/**
 *
 * @author davidpiedra
 */
public class Course {
    private ArrayList<Student> students = new ArrayList();
    private String courseName;
    public Course(String name) {
        this.courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String firstName, String lastName, int grade) {
        if(students.size() < 32) {
            students.add(new Student(firstName,lastName,grade));
        } else {
            System.out.println("Course is full!");
        }
    }
    public int getStudentAmount() {
        return students.size();
    }
    public Student getStudent(int index) {
        return students.get(index);
    }
}