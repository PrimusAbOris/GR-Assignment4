package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class GR_Assignment4 {
	public static int FILE_LENGTH = 101;

	public static void main(String[] args) throws FileNotFoundException {
		Student[] allStudents; //this will be populated first
		Student[] compSciStudents; // this will become course1.csv
		Student[] apmthStudents; // course2.csv
		Student[] statStudents; // course3.csv
		
	

		FileReadService.getStudentArray("student-master-list.csv");
		
		
		// a method in FileReadService will return...
		// String[] arrayFromCSV;
		
		ArraySortService.arraySort();
		// split the array into three parts, based on the String "course"... if statement?
		
		// FileWriteService.writeToFile;
		// course1.csv, course2.csv, course3.csv

	}

}
