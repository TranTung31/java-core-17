package oop;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("Nguyen Van C", 19);
		st.setName("Nguyen Van D");
		st.setAge(17);
		System.out.println("Student with name = " + st.getName() + ", age = " + st.getAge());
	}

}
