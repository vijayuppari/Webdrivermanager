package TestPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class maximumrepeating {
	
	public static void main(String[] args) {
		
		
		int [] arrA = new int[]{4, 1, 5, 2, 1, 5, 9, 8, 4,6, 5, 3, 2, 4, 7,9,10,9,9,4,5,5};
		
		// Approach 1: to get Maximum number form given list
		List<Integer> asList  = new ArrayList<>(Arrays.asList(4, 1, 5, 2, 1, 5, 9, 8, 4,6, 5, 3, 2, 4, 7,9,10,9,9,4,5,5));
		int orElse = asList.stream().mapToInt(e->e).max().orElse(Integer.MIN_VALUE);
		System.out.println(orElse);
		
		// Approach 2: to get Maximum number form given list
		Optional<Integer> max = asList.stream().max(Comparator.naturalOrder());
		System.out.println(max.get());
		
		// reverse the List
		List<Integer> asList1  = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		asList1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		
		// reverse the List
		List<Integer> asList2  = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Integer integer = asList2.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(integer);
	
		
		// To get most repeated number from given array
		HashMap<Integer, Integer> hmap= new HashMap<>();
		for(int i=0;i<arrA.length-1;i++){
			if(hmap.containsKey(arrA[i])){
				hmap.put(arrA[i], hmap.get(arrA[i])+1);
				
			}
			else{
				hmap.put(arrA[i], 1);
			}
		}
		
		/*Set<Entry<Integer, Integer>> repeat = hmap.entrySet();
		for(Entry<Integer, Integer> e: repeat){
			if(e.getValue()>1){
				System.out.println("Number is " + e.getKey() +" and repeating " + e.getValue());
			}
		}*/
		
		Iterator<Entry<Integer, Integer>> ite = hmap.entrySet().iterator();
		int maxcount=0;
		int element =arrA[0];
		while(ite.hasNext()){
			Entry<Integer, Integer> next = ite.next();
			Integer value = next.getValue();
			if(maxcount<value){
				maxcount=value;
				element =next.getKey();
			}
		}
		System.out.println("Number " + element + " is " + "repeating "  + maxcount + " times");
	}

}
