package Naveen.Java8.concepts;

import java.util.function.Function;

public class Functioninterfaceconcept {
	
	public static void main(String[] args) {
		
		
		Function<String, Integer> func = x->x.length();
		Integer len = func.apply("Vijay Kumar");
		System.out.println(len);
		
		// Example 2:
		
		Function<Integer, Integer> func1 = x->x*2;
		Integer len1 = func.andThen(func1).apply("Vijay Kumar");
		System.out.println(len1);
	}

}
