package com.coderscampus.assignment4;

public class ArraySortService {

	//@SuppressWarnings("null")
	public static Student[] arraySortBySubject(Student[] allStudents, String subject) {
		Student[] allInSubject = new Student[10000];
		// return arr;
		int i = 0; // size of the array being built of students taking a given subject
		for (Student student : allStudents) {
			if (student != null) {
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
			}
		}
		return allInSubject;
	}
}
