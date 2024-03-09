package javacore;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ và tên: ");
		String name = scanner.nextLine();
		System.out.print("Nhập điểm: ");
		float result = scanner.nextFloat();
		System.out.println(name + " có điểm = " + result);
		scanner.close();
	}
}
