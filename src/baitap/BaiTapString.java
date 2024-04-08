package baitap;

import java.util.Scanner;

public class BaiTapString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập username: ");
		String username = scanner.nextLine();
		System.out.print("Nhập password: ");
		String password = scanner.nextLine();
		System.out.println("Username: " + username + ", password: " + password);
		if (username.equals("abc") && password.length() > 6) {
			System.out.println("Hợp lệ!");
		} else {
			System.out.println("Không hợp lệ!");
		}
		scanner.close();
	}
}
