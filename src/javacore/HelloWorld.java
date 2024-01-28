package javacore;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên của bạn: ");
		String name = scanner.nextLine();
		System.out.print("Nhập tuổi của bạn: ");
		int age = scanner.nextInt();
		System.out.println("Tên bạn là: " + name + ", tuổi là: " + age);
	}
}
