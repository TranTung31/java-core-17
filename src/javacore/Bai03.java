package javacore;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh của hình lập phương: ");
		float canh = scanner.nextFloat();
		System.out.println("Thể tích của hình lập phương: " + Math.pow(canh, 3));
		scanner.close();
	}
}
