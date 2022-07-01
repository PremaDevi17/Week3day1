package org.student;
import org.department.*;

public class Student extends Department {
public static void main(String[] args) {
	Department department = new Department();
	department.collegeName();
	department.collegeCode();
	department.collegeRank();
	department.deptName();
	Student student = new Student();
	student.studentName();
	student.studentDept();
	student.studentID();
}
public void studentName() {
	System.out.println("Student Name : Nithik.D");
}
public void studentDept() {
	System.out.println("Student Dept : Science");
}
public void studentID() {
	System.out.println("Student ID - 2343");
}
}
