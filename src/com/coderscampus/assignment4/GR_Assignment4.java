package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class GR_Assignment4 {

	public static void main(String[] args) throws FileNotFoundException {
		Student[] allStudents; //this will be populated first
		Student[] compSciStudents; // this will become course1.csv
		Student[] apmthStudents; // course2.csv
		Student[] statStudents; // course3.csv
		
	
		BufferedReader br = new BufferedReader(new FileReader("student-master-list.csv"));
		
		
		String[] arrayFromCSV;
		
		ArraySortService.arraySort();
		// FileWriteService.writeToFile;
		// course1.csv, course2.csv, course3.csv

	}

}
