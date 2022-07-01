package org.department;
import org.college.*;


public class Department extends College  {
public static void main(String[] args) {
	College college = new College();
	college.collegeCode();
	college.collegeName();
	college.collegeRank();
}
public void deptName() {
	System.out.println("DeptName : Science");
}
}
