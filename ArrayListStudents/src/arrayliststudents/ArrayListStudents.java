/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayliststudents;

import java.util.Scanner;

/**
 *
 * @author davidpiedra
 */
public class ArrayListStudents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        String courseName = user.next();
        Course course = new Course(courseName);
        char conditional = 'y';
        while(conditional != 'n') {
            System.out.print("Enter Student\'s First Name: ");
            String fName = user.next();
            System.out.print("Enter Student\'s Last Name: ");
            String lName = user.next();
            System.out.print("Enter Student\'s Grade: ");
            int grade = user.nextInt();
            course.addStudent(fName, lName, grade);
            System.out.println("Press n to quit, y to add another student");
            conditional = user.next().toLowerCase().charAt(0);
        }
        System.out.println("\n\n\n\n\n");
        System.out.println("List of Students:");
        int size = course.getStudentAmount();
        for(int i = 0; i < size; i++) {
            System.out.println("Student: " + course.getStudent(i).toString());
        }
    }
    
}