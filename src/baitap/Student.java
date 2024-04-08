package baitap;

import java.util.ArrayList;

public class Student {
	private String name;
	private int id;

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student() {

	}

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList();
		Student s1 = new Student("Nguyen Van A", 1);
		Student s2 = new Student("Pham Van B", 2);
		Student s3 = new Student("Nguyen Van C", 3);
		Student s4 = new Student("Trinh Van D", 4);
		Student s5 = new Student("Bui Van E", 5);
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		arr.add(s5);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Nguyen")) {
				System.out.println(arr.get(i));
			}
		}
		System.out.println("Array: " + arr);
	}
}
