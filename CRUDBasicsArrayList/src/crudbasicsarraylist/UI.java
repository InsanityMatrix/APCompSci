/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudbasicsarraylist;

import static java.lang.Double.NaN;
import java.util.Scanner;


public class UI {

    private Scanner userIn;
    private Course course;

    public UI() {
        userIn = new Scanner(System.in);
        course = new Course("Science", "101");

        System.out.println("Welcome to Course Genie 101");
        boolean finished = false;
        while (!(finished)) {

            System.out.println("\nPlease choose from below:"
                    + "\n"
                    + "1. Add a student to this course\n"
                    + "2. Remove a student from this course\n"
                    + "3. Modify student information\n"
                    + "4. View details of student\n");
            System.out.print("Enter the number corresponding to your choice : ");
            int choice = userIn.nextInt();

            switch (choice) {
                case (1):
                    AddStudent();
                    break;
                case (2):
                    RemoveStudent();
                    break;
                case (3):
                    ModifyStudent();
                    break;
                case (4):
                    ViewDetails();
                    break;
            }

        }

    }

    public void AddStudent() {
        System.out.println("Please enter ..."
                + "\nStudent First Name : ");
        String firstName = userIn.next();

        System.out.print("Student Last name : ");
        String lastName = userIn.next();
        System.out.println("");
        System.out.print("Student Grade : ");
        int grade = userIn.nextInt();
        System.out.println("");
        course.AddStudent(firstName, lastName, grade);

        System.out.println(course);

    }

    public void RemoveStudent() {
        System.out.println("Please indicate the number corresponding to the student to be removed from course.");
        System.out.println(course);
        System.out.print("Enter number : ");
        int indexToBeRemoved = userIn.nextInt();
        course.RemoveStudent(indexToBeRemoved);
        System.out.println(course);
        System.out.println("");
    }

    public void ModifyStudent() {
        System.out.println("Please indicate the number corresponding to the student to be modified in course.");
        System.out.println(course);
        System.out.print("Enter Number : ");
        int indexToBeModified = userIn.nextInt();
        Student student = course.getStudents().get(indexToBeModified - 1);
        System.out.println(student);

        System.out.print("New first name (Press x if no changes) : ");
        String newFirstName = userIn.next();
        System.out.println("");

        System.out.println("New last name (Press x if no changes) : ");
        String newLastName = userIn.next();
        System.out.println("");

        System.out.println("New grade (Press 0 if no changes) : ");
        int newGrade = userIn.nextInt();
        System.out.println("");

        String studentFirstName = (newFirstName.equals("x")) ? student.getFirstName() : newFirstName;
        String studentLastName = (newLastName.equals("x")) ? student.getLastName() : newLastName;
        int studentGrade = (newGrade == 0) ? student.getGrade() : newGrade;

        System.out.println("Modifying with " + studentFirstName + " " + studentLastName);
        student.setFirstName(studentFirstName);
        student.setLastName(studentLastName);
        student.setGrade(studentGrade);
        System.out.println("These are now the students in the course");
        System.out.println(course);
    }

    public void ViewDetails() {
        System.out.println("Please indicate the number corresponding to the student to be viewed in course.");
        System.out.println(course);
        System.out.print("Enter number : ");
        int indexToBeViewed = userIn.nextInt();
        Student student = course.getStudents().get(indexToBeViewed - 1);
        System.out.println("Here are the student details");
        System.out.println(student);
    }

}
