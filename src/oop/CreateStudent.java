package oop;

public class CreateStudent {

	public static void main(String[] args) {
		// Khởi tạo 1 đối tượng st từ class Student
		Student st = new Student();
		st.name = "Nguyen Van A";
		st.age = 20;
		System.out.println("Student with name = " + st.name + ", age = " + st.age);
	}

}
