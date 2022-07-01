package org.system;

public class Students {
	public static void main(String[] args) {
		int id = 123;
		String name = "Nithik", email = "Hi@gmail.com";
		Long phoneNum = 233255645354L;
		
		Students students = new Students();	
		students.getStudentInfo(id);
		students.getStudentInfo(id, name);
		students.getStudentInfo(email, phoneNum);
	}
	public int getStudentInfo(int id) {
		System.out.println(id);
		return id;
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println(id+"," + name);
	}
	
	public void getStudentInfo(String email, long phoneNum) {
		System.out.println(email+"," + phoneNum);
	}
}
