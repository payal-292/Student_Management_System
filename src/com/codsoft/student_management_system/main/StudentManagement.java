package com.codsoft.student_management_system.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
	private List<Student> students = new ArrayList<>();
	
	public void addStudent(Student student) {
		students.add(student);
	}
	public void removeStudent(String rollno) {
		students.removeIf(student->student.getRollno().equals(rollno));
	}
	public Student searchStudent(String rollno) {
		for(Student student:students) {
			if(student.getRollno().equals(rollno)) {
				return student;
			}
		}
		return null;
	}
	public void displayAllStudent() {
		for(Student student : students) {
			System.out.println(student);
		}
	}
	public void saveStudentsFile(String filename) {
		try (PrintWriter printWriter = new PrintWriter(new FileWriter(filename))){
			for(Student student : students) {
				printWriter.println(student.getName() + ", " + student.getRollno() + ", " + student.getGrade());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error Saving Students to file. " + e.getMessage());
		}
	}
	public void loadStudentsFromFile(String filename) throws IOException{
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
			String line;
			while((line = reader.readLine()) != null){
				String parts[] = line.split(", ");
				if(parts.length == 3) {
					String name = parts[0];
					String rollno = parts[1];
					String grade = parts[2];
					Student student = new Student(name, rollno, grade);
					students.add(student);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
