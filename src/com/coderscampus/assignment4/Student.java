package com.coderscampus.assignment4;

public class Student {
	// Student POJO based on provided CSV
	private int studentId;
	private String name;
	private String course;
	private int grade;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student(int studentId, String name, String course, int grade) {
		this.studentId = studentId;
		this.name = name;
		this.course = course;
		this.grade = grade;
	}
	
}
