package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadService {
	
	public static Student[] getStudentArray(String filename) throws IOException {
		// takes in the filename, returns the array of all students in all subjects
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String[] garbageLine = br.readLine().split(",");
		
		Student[] allStudents = new Student[GR_Assignment4.FILE_LENGTH + 1];
		String[] line = null;
		for (int i = 1; i <= GR_Assignment4.FILE_LENGTH; i++) {
			// i = 1, because we start on the second line
			if (br.readLine() != null) {
				line = br.readLine().split(",");
			}
			System.out.println(line[0] + line[1] + line[2] + line[3]); //test
			int studentId = Integer.parseInt(line[0]);
			String name = line[1];
			String course = line[2];
			int grade = Integer.parseInt(line[3]);
			Student s = new Student(studentId, name, course, grade);
			if (s != null) allStudents[i] = s;
		}
		br.close();
		return allStudents;
	}
}
