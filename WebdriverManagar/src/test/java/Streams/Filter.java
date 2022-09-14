package Streams;

import java.util.Arrays;
import java.util.List;

public class Filter {
	
	
	public static void main(String[] args) {
		
		
		List<String> prodlist= Arrays.asList("iphone","Macbok","Battery","Phones","clothes");
		//prodlist.forEach(System.out::println);
		
		// startswith
		
		//prodlist.stream().filter(e->e.startsWith("i")).forEach(System.out::println);
		
		// uppercase- specific element in the list
		//prodlist.stream().filter(e->e.startsWith("c")).map(e->e.toUpperCase()).forEach(System.out::println);
		
		// length of all elements in the List
		 //prodlist.stream().map(String::length).forEach(System.out::println);
		 
		// length of specific element in the list
		prodlist.stream().filter(e->e.startsWith("c")).map(String::length).forEach(System.out::println);
		
	}

}
