/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudbasicsarraylist;

import java.util.ArrayList;


public class Course {

    private String name;
    private String code;
    private ArrayList<Student> students;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
        this.students = new ArrayList<Student>();
        // Prepopulate for testing
        AddStudent("Jane", "Blake", 9);
        AddStudent("Henry", "Moulang", 9);
        AddStudent("Ellen", "Roe", 9);
        AddStudent("Mary", "Reveille", 9);
        AddStudent("Jane", "Newport", 9);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void AddStudent(String firstName, String lastName, int grade) {
        Student student = new Student(firstName, lastName, grade);
        students.add(student);
    }

    public void RemoveStudent(int index) {
        students.remove(index-1);
    }

    public String toString() {
        String allStudents = "";
        int index = 1;

        allStudents += "These are the students in the course : \n";
        for (Student student : students) {
            allStudents += "\n" + index + ": " + student.getFirstName() + " " + student.getLastName();
            index++;
        }
        allStudents += "\n";
        return allStudents;
    }

}
