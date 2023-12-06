//due to crashes, sort arrays in a method here?
package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class GR_Assignment4 {
	public static int FILE_LENGTH = 101;

	public static void main(String[] args) throws IOException {
		Student[] allStudents; //this will be populated first
		
		/* LIKELY REMOVE
		Student[] compSciStudents; // this will become course1.csv
		Student[] apmthStudents; // course3.csv
		Student[] statStudents; // course2.csv
		
		allStudents = FileReadService.getStudentArray("student-master-list.csv");
		
		compSciStudents = ArraySortService.arraySortBySubject(allStudents,"CS");
		statStudents = ArraySortService.arraySortBySubject(allStudents,"stats");
		apmthStudents = ArraySortService.arraySortBySubject(allStudents,"math");
		
		Arrays.sort(compSciStudents); // this crashes--Student cannot be cast to class java.lang.Comparable?
		Arrays.sort(apmthStudents);
		Arrays.sort(statStudents);
		*/
		
		
		FileWriteService.writeFile(compSciStudents, "course1.csv");
		FileWriteService.writeFile(statStudents, "course2.csv");
		FileWriteService.writeFile(apmthStudents, "course3.csv");
		// split the array into three parts, based on the String "course"... if statement?
		

	}
	
	public Student[] arraySortBySubject(Student[] allStudents, String subject) {
		Student[] allInSubject = new Student[40];
		// return arr;
		int i = 0; // size of the array being built of students taking a given subject
		for (Student student : allStudents) {
			if (student != null && i < 40) { // statement getting messy, may need to redo
				if (student.getCourse().contains("COMPSCI") && subject == "CS") {
					allInSubject[i] = student;
					i++;
				}

				if (student.getCourse().contains("STAT") && subject == "stats") {
					allInSubject[i] = student;
					i++;
				}

				if (student.getCourse().contains("APMTH") && subject == "math") {
					allInSubject[i] = student;
					i++;
				}
				if (i < 40 && allInSubject[i] != null) { //test
					System.out.print(i); // test
					System.out.println(allInSubject[i].getStudentId()); // test
				}
//				if (allInSubject[i].getStudentId() == allInSubject[i-1].getStudentId()) {
//					return allInSubject;
//				}
			}
		}
		return allInSubject;
	}

}
