package NaveenautoamtionLabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {
	
	public static void main(String[] args) {
		
		ArrayList<String> list1= new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> list2= new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> list3= new ArrayList<>(Arrays.asList("A","B","C","D","F"));
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1.equals(list2));		
		Collections.sort(list3);
		System.out.println(list2.equals(list3));
		
		ArrayList<String> list4= new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		list3.removeAll(list4);
		System.out.println(list3);
		
		// Common Elements
		ArrayList<String> list5= new ArrayList<>(Arrays.asList("A","B","C","D","G"));
		list4.retainAll(list5);
		System.out.println(list4);
		
		// 
		System.out.println("Covert to Arrays ");
		Object[] array = list1.toArray();
		Object[] array1 = list3.toArray();
		Arrays.sort(array);
		Arrays.sort(array1);
		System.out.println(Arrays.equals(array, array1));
		
		
	}

}
