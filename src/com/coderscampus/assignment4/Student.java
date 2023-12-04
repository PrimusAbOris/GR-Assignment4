package com.coderscampus.assignment4;

public class Student {
	// Student POJO based on provided CSV
	
	//example line: 91,Donald Schultz,COMPSCI 321,87
	//              ID,name          ,subject [/],grade
	private String studentId; // no ints, this lets them all be strings
	private String name;
	private String course;
	private String grade;
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student(String studentId, String name, String course, String grade) {
		this.studentId = studentId;
		this.name = name;
		this.course = course;
		this.grade = grade;
	}
	
}
