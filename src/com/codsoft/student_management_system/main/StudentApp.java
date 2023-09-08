package com.codsoft.student_management_system.main;

import java.io.IOException;
import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		StudentManagement management = new StudentManagement();
		while(true) {
			System.out.println("\n Options" +
								"\n 1.Add new Student" + 
								"\n 2.Remove a Student" + 
								"\n 3.Search a Student" + 
								"\n 4.Display All Students Details"+
								"\n 5.Exit" + 
								"\n Enter Your Choice : ") ;
			String choice = scanner.nextLine();
			switch (choice) {
			case "1":
				System.out.println("Enter the Student Name : ");
				String name = scanner.nextLine();
				System.out.println("Enter the rollNumber of Student : ");
				String rollno = scanner.nextLine();
				System.out.println("Enter the Student Grade : ");
				String grade = scanner.nextLine();
				
				Student student = new Student(name, rollno, grade);
				management.addStudent(student);
				System.out.println("Student added successfully");
						
				break;
			case "2":
				System.out.println("Enter the Roll Number of the Student to remove");
				rollno = scanner.nextLine();
				management.removeStudent(rollno);
				System.out.println("Student remove successfully");
				
				break;
			case "3":
				System.out.println("Enter the RollNumber of Student to Search");
				rollno = scanner.nextLine();
				Student searchedStudent = management.searchStudent(rollno);
				if(searchedStudent != null) {
					System.out.println("Student Found!!");
					System.out.println(searchedStudent);
				}
				else {
					System.out.println("Student Not Found");
				}
				
				break;
			case "4":
				System.out.println("All Student");
				management.displayAllStudent();
				
				break;
			case "5":
				System.out.println("Exiting the Application");
				scanner.close();
				System.exit(0);
				
			default:
				System.out.println("Invalid Choiuce. Please Try Again!!!");
				break;
			}
		}
		
	}

}
