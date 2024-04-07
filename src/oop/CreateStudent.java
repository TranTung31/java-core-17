package oop;

public class CreateStudent {
	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Khởi tạo 1 đối tượng st từ class Student
		Student st = new Student(); // constructor không có tham số
		st.setName("Nguyen Van A");
		st.setAge(19);
		System.out.println("Student with name = " + st.getName() + ", age = " + st.getAge());

		CreateStudent st1 = new CreateStudent();
		int result = st1.sum(5, 6);
		System.out.println("Check sum = " + result);
	}

}
