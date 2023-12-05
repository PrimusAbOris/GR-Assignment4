// might need to be simpler; should only split each line once
package com.coderscampus.assignment4;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteService {
	public static void writeFile(Student[] allInSubject, String filename) throws IOException {
		if (allInSubject[0].getCourse().contains("COMPSCI")) { // outputting the CompSci CSV
			FileWriter fw1 = new FileWriter("course1.csv");
			fw1.write("Student ID,Student Name,Course,Grade\n");

			for (Student student : allInSubject) {
				if (student != null) {
					System.out.println(student.toString()); //comment out later
					fw1.write(student.toString() + "\n");
				}
			}
			if (allInSubject[0].getCourse().contains("STAT")) { // outputting the Stat student CSV
				FileWriter fw2 = new FileWriter("course2.csv");
				fw2.write("Student ID,Student Name,Course,Grade\n");

				for (Student student : allInSubject) {
					if (student != null)
						fw2.write(student.toString() + "\n");
				}
			}
			if (allInSubject[0].getCourse().contains("APMTH")) { // outputting the Math student CSV
				FileWriter fw3 = new FileWriter("course3.csv");
				fw3.write("Student ID,Student Name,Course,Grade\n");

				for (Student student : allInSubject) {
					if (student != null) {
						fw3.write(student.toString() + "\n");
					}
				}
			}
		}
	}
}