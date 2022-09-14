package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintSumofAllNumbers {
	
	public static void main(String[] args) {
		
		//Sum of numbers - Approach 1:
		List<Integer> intnumbers = Arrays.asList(1,2,4,5,6,2);
		Optional<Integer> reduce = intnumbers.stream().reduce((a,b)->a+b);
		System.out.println("Sum of all Numbers in the list " +reduce);
		System.out.println("Sum of all Numbers in the list " +reduce.get());
		
		//Sum of numbers - Approach 2:
		
		List<Integer> intnumbers2 = Arrays.asList(1,2,4,5,6,2);
		int sum1 = intnumbers.stream().mapToInt(x->x).sum();
		System.out.println("Sum of all Numbers in the list using sum method " +sum1);
		
		//Remove duplicates
		
		List<Integer> duplicates = Arrays.asList(1,2,4,5,6,2);
		duplicates.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		
		// Average of all Numbers
		
		List<Integer> avgofnumbes = Arrays.asList(1,2,4,5,6,2);
		OptionalDouble average = avgofnumbes.stream().mapToInt(x->x).average();
		System.out.println("Avarage of all Numbers in the list " +average);
		
		// Total number of elements in the List
		
		Integer arr[]= new Integer []{1,2,4,5,6,2};
		List<Integer> totalcount = Arrays.asList(arr);
		long count = totalcount.stream().mapToInt(x->x).count();
		System.out.println("Count of all Numbers in the list " +count);
		
		// Print Even and Odd Numbers
		List<Integer> printevenodd = Arrays.asList(1,22,41,53,60,2);
		printevenodd.stream().filter(e->!(e%2==0)).forEach(e->System.out.println(e));
		
		// Print Numbers Prefix startswith 2
		System.out.println("*******************prefix");
		List<Integer> printprefix2 = Arrays.asList(1,22,41,53,60,2);
		printprefix2.stream().map(e->String.valueOf(e)).filter(e1->e1.startsWith("2")).forEach(System.out::println);
		
		// Print Duplicate Numbers using Streams
		System.out.println("Duplicate Numbers");
		List<Integer> Duplicate = Arrays.asList(1,40,22,1,22,3,2,3);
		Set<Integer> hset= new HashSet<>();
		Duplicate.stream().filter(e->!hset.add(e)==true).collect(Collectors.toSet()).forEach(System.out::println);
		
		
		// Max and min numbers in the list
		List<Integer> maxmin = Arrays.asList(1,40,22,1,22,3,2,3);
		OptionalInt max = maxmin.stream().mapToInt(e->e).min();
		System.out.println("Maximum number in the list "+max.getAsInt());
		
		// Sorting list of elements
		System.out.println("Sorting list of elements");
		List<Integer> sorting = Arrays.asList(1,22,41,53,60,2,1,53);
		sorting.stream().sorted().collect(Collectors.toSet()).forEach(System.out::println);
		sorting.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		// reverse Order of List of Elements
		System.out.println("reverse Order of List of Elements");
		List<Integer> reversorting = Arrays.asList(1,22,41,53,60,2,1,53);
		reversorting.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		
		
		// Limit
		System.out.println("Limit List of Elements");
		List<Integer> limitele = Arrays.asList(1,2,5,53,60,2,1,53,90,18,19,34);
		limitele.stream().limit(5).forEach(System.out::println);
		
		// Sum of first 3 elements
		System.out.println("Sum of first 3 elements");
		List<Integer> sumoffirst3 = Arrays.asList(1,2,5,53,60,2,1,53,90,18,19,34);
		int sum = sumoffirst3.stream().limit(3).mapToInt(e->e).sum();
		System.out.println("Sum of first 3 elemetns " + sum);
		
		// Skip
		System.out.println("Skip List of Elements");
		List<Integer> skipele = Arrays.asList(1,2,5,53,60,2,1,53,90,18,19,34);
		skipele.stream().skip(4).forEach(System.out::println);
		
		// Get Second Highest
		System.out.println("Get Second Highest");
		List<Integer> secondhigh = Arrays.asList(1,2,5,53,60,2,1,53,90,180,19,34,200);
		Integer integer = secondhigh.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("Second Highest number " + integer);
		
		// Get Second Lowest
		System.out.println("Get Second Lowest");
		List<Integer> secondlow = Arrays.asList(2,5,53,60,2,53,90,180,19,34,200);
		Integer low = secondlow.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("Lowest  number " + low);
	}

}
