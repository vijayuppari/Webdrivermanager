package Adaptorpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SqaureofNumbersandFindLargest {
	
	public static void main(String[] args) {
		
		int A[]= new int[]{1,2,3,4,5,6};
		System.out.println(sqaure(5, A));
		
	}
	
	public static int sqaure(int N, int A[]){
		
		List<Integer> numbers = Arrays.asList(A[N]);
		List<Integer> newlist = new ArrayList<Integer>();
		HashSet<Integer> uniqueValues = new HashSet<>(numbers);

		for (Integer value : uniqueValues) {
		    //System.out.println(value + "\t" + (int)Math.pow(value, 2));
			newlist.add((int)Math.pow(value, 2));	
		}
		Object[] array12 = newlist.toArray();
		Arrays.sort(array12);
		int result=(int) array12[array12.length-1];
		return result;
	}

}
