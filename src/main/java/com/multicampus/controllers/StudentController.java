package com.multicampus.controllers;

import com.multicampus.daos.StudentDAO;
import com.multicampus.models.Student;

import java.util.Scanner;

public class StudentController {
    private StudentDAO stdDAO;

    public StudentController() {
        this.stdDAO = new StudentDAO();
    }

    //1. Add a new Student
    public void addNewStudent(){
        //1.1 Input new Student Info > Create a new Student
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new Student info:");
        System.out.println("Student ID:");
        String stdID = sc.nextLine();
        System.out.println("Student Name:");
        String stdName = sc.nextLine();
        System.out.println("Student Contact:");
        String stdMobile = sc.nextLine();
        Student std = new Student(stdID, stdName, stdMobile);
        //1.2 StudentDAO.addNewStudent(Student std)
        stdDAO.addNewStudent(std);
    }


    //2. Delete a Student(){
    public void deleteStudent(){
        System.out.println("Delete a Student");
    }

    //3. Update a Student
    public void updateStudent(){
        System.out.println("Update a Student");
    }

    //4. Seach Student
    public void searchStudent(){
        System.out.println("Search Student");
    }

    //5. Display Student
    public void displayStudent() {
        this.stdDAO.displayStudent();
    }
}
