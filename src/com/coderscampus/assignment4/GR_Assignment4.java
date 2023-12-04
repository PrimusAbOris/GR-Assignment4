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
		
		FileWriteService.writeFile(compSciStudents);
		FileWriteService.writeFile(statStudents);
		FileWriteService.writeFile(apmthStudents);
		// split the array into three parts, based on the String "course"... if statement?
		
		// FileWriteService.writeToFile;
		// course1.csv, course2.csv, course3.csv

	}

}
