package oop;

public class CreateStudent {
	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Khởi tạo 1 đối tượng st từ class Student
		Student st = new Student(); // constructor không có tham số
		st.name = "Nguyen Van A";
		st.age = 20;
		System.out.println("Student with name = " + st.name + ", age = " + st.age);

		CreateStudent st1 = new CreateStudent();
		int result = st1.sum(5, 6);
		System.out.println("Check sum = " + result);
	}

}
