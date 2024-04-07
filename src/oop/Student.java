package oop;

public class Student {
	private String name;
	private int age;

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

	// - Getter, Setter mô tả tính đóng gói (encapsulation) trong Java
	// - Để tăng tính bảo mật cho dữ liệu cần:
	// + Hạn chế quyền modify data (chỉnh sửa dữ liệu)
	// + Che dấu dữ liệu (public/private)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
