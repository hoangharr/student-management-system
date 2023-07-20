package com.multicampus.daos;

import com.multicampus.models.Student;

import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {
    private ArrayList<Student> listOfStudents;

    public StudentDAO() {
        this.listOfStudents = new ArrayList<Student>();
        String dbURL = "jdbc:mariadb://localhost:3306/ems";
        String username = "root";
        String password = "abc";

        try {
            //Class.forName("org.mariadb.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, username, password);

            if (conn != null) {
                String sql = "SELECT * FROM student";

                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql);

                int count = 0;

                while (result.next()){
                    String stdID = result.getString("stdID");
                    String stdName = result.getString("stdName");
                    String stdMobile = result.getString("stdMobile");

                    //Convert sang Object
                    Student std = new Student(stdID, stdName, stdMobile);
                    listOfStudents.add(std);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //1. Add a new Student
    public void addNewStudent(Student std){
        this.listOfStudents.add(std);
        System.out.println(this.listOfStudents.size());
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
    public void displayStudent(){
        if(this.listOfStudents.isEmpty()){
            System.out.println("List is Empty");
        }else{
            System.out.println("List of Students");
            for(Student std : listOfStudents){
                System.out.println(std.toString());
            }
        }
    }
}
