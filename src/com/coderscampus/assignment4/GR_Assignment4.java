package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GR_Assignment4 {
	public static int FILE_LENGTH = 101;

	public static void main(String[] args) throws IOException {
		Student[] allStudents; //this will be populated first
		Student[] compSciStudents; // this will become course1.csv
		Student[] apmthStudents; // course2.csv
		Student[] statStudents; // course3.csv
		
	

		Student[] studentArray = FileReadService.getStudentArray("student-master-list.csv");
		
		
		ArraySortService.arraySort(studentArray);
		// split the array into three parts, based on the String "course"... if statement?
		
		// FileWriteService.writeToFile;
		// course1.csv, course2.csv, course3.csv

	}

}
