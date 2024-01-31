package javacore;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("First number: ");
		int firstNumber = scanner.nextInt();
		System.out.print("Second number: ");
		int secondNumber = scanner.nextInt();
		System.out.println("Min: " + Math.min(firstNumber, secondNumber));
		System.out.println("Pow: " + Math.pow(firstNumber, secondNumber));
	}
}
