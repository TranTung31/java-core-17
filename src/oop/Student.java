package oop;

public class Student {
	String name;
	int age;

	public void newStudent() {
		System.out.println("New Student!");
	}

	// - Hàm tạo (constructor) không có tham số, mặc định nếu không khai báo
	// thì sẽ tự động có
	// - Lưu ý: Tên của hàm tạo sẽ phải trùng với tên của class
	public Student() {

	}

	// - Hàm tạo (constructor) có tham số truyền vào
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
