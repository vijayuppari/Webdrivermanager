package NaveenautoamtionLabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArryList {
	
	public static void main(String[] args) {
		
		// Remove
		ArrayList<Integer> arrlist= new ArrayList<>(Arrays.asList(2,4,10,8,9,7));
		arrlist.removeIf(ele->ele%2==0);
		System.out.println(arrlist);
		
		//RetainAll
		ArrayList<String> nameslist= new ArrayList<>(Arrays.asList("Vijay","Harish","naveen"));
		nameslist.retainAll(Collections.singleton("naveen"));
		System.out.println("Retail All "+ nameslist);
		
		// SubList
		ArrayList<Integer> numberlist= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		ArrayList<Integer> numberlist1 = new ArrayList<>(numberlist.subList(0, 3));
		System.out.println("Sub List " + numberlist1);
		
		// Array List to Array
		Object[] toarr = numberlist.toArray();
		System.out.println(Arrays.toString(toarr));
		
	}

}
