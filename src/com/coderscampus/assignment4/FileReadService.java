package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadService {
	
	public static Student[] getStudentArray(String filename) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String[] garbageLine = br.readLine().split(",");
		
		Student[] studentArray = new Student[GR_Assignment4.FILE_LENGTH];
		for (int i = 1; i <= GR_Assignment4.FILE_LENGTH; i++) {
			// i = 1, because we start on the second line
			String[] line = br.readLine().split(",");
			System.out.println(line[0] + line[1]); //test
			int studentId = Integer.parseInt(line[0]);
			String name = line[1];
			String course = line[2];
			int grade = Integer.parseInt(line[3]);
			Student s = new Student(studentId, name, course, grade);
			studentArray[i] = s;
		}
		return studentArray;
	}
}
