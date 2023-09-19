package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadService {
	
	public static Student[] getStudentArray(String filename) {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		Student[] studentArray = new Student[GR_Assignment4.FILE_LENGTH];
		for (int i = 0; i <= GR_Assignment4.FILE_LENGTH; i++) {
			String[] line = br.readLine().split(",");

			int studentId = Integer.parseInt(line[0]);
			String name = line[1];
			String course = line[2];
			int grade = Integer.parseInt(line[3]);

			Student s = new Student(studentId, name, course, grade);
			studentArray[i] = s;
		}
		return studentArray;
}
