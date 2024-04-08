package oop;

import java.util.ArrayList;

public class IntanceArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			a.add(i + 1);
		}
		System.out.println("Array list: " + a);
		System.out.println("Array size: " + a.size());
		System.out.println("Value index 1: " + a.get(1));
	}

}
