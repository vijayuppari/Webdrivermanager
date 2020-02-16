package Algorthims;

import java.util.Arrays;

public class Arrayscompare {
	
	

	public static void main(String[] args) {

		String a[] = { "vijay", "nani", "java" };
		String b[] = { "vijay", "nani", "java1" };

		boolean equals = Arrays.equals(a, b);
		if (equals == true) {
			System.out.println("Both Arrays are equal");
		} else
			System.out.println("Both arrays are not equal");

	}

}
