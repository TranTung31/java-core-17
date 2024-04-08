package baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTapArrayList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> arr = new ArrayList<Double>();
		while (true) {
			System.out.print("Nhập số thực: ");
			double a = scanner.nextDouble();
			arr.add(a);
			scanner.nextLine();
			System.out.print("Bạn có muốn nhập tiếp (Y/N)? ");
			String option = scanner.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;
			}
			if (option.equals("Y")) {
				continue;
			}
		}
		double total = 0;
		for (int i = 0; i < arr.size(); i++) {
			total += arr.get(i);
		}
		System.out.println("Tổng các số thực: " + total);
	}
}
