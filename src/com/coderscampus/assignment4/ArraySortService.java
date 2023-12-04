//too many services, this can be main
package com.coderscampus.assignment4;

public class ArraySortService {

	//@SuppressWarnings("null")
	public static Student[] arraySortBySubject(Student[] allStudents, String subject) {
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
