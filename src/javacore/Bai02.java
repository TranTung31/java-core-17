package javacore;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều rộng HCN: ");
		float chieuRong = scanner.nextFloat();
		System.out.print("Nhập chiều dài HCN: ");
		float chieuDai = scanner.nextFloat();
		System.out.println("Chu vi: " + (chieuRong + chieuDai) * 2);
		System.out.println("Diện tích: " + chieuRong * chieuDai);
		System.out.println("Cạnh nhỏ nhất: " + Math.min(chieuRong, chieuDai));
		scanner.close();
	}
}
