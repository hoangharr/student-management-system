package com.multicampus;

import com.multicampus.controllers.StudentController;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Show Menu cho nguoi dung
        Scanner sc = new Scanner(System.in);
        StudentController student = new StudentController();
        int option = 0;
        do{
            showMenu();
            option = sc.nextInt();
            //Kiem tra option de goi Menu tuong ung
            switch(option){
                case 1:
                    student.addNewStudent();
                    break;
                case 2:
                    student.deleteStudent();
                    break;
                case 3:
                    student.updateStudent();
                    break;
                case 4:
                    student.searchStudent();
                    break;
                case 5:
                    student.displayStudent();
                    break;
                case 9:
                    System.out.println("Good bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }while(option != 9);
    }

    public static void showMenu(){
        System.out.println("MENU");
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Update Student");
        System.out.println("4: Search Student");
        System.out.println("5: Display Students");
        System.out.println("9: Exit program");
        System.out.print("Enter your selection : ");
    }
}