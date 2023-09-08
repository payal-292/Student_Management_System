package com.codsoft.student_management_system.main;

public class Student {
	private String name;
	private String rollno;
	private String grade;
	public Student(String name, String rollno, String grade) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", grade=" + grade + "]";
	}
	

}
