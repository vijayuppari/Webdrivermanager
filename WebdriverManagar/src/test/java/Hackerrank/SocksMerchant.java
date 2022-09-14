package Hackerrank;

import java.util.HashSet;
import java.util.Set;

public class SocksMerchant {
	
	public static void main(String[] args) {
		
		int arr[]= new int[]{10,20,10,10,20,20,20,30,50};
		sockspairs(arr);
		
	}
	
	public static void sockspairs(int[] arr){
		
		int pair=0;
		Set<Integer> arrset= new HashSet<>();
		for(int i=0;i<arr.length;i++){
			if(!arrset.contains(arr[i])){

				arrset.add(arr[i]);
			}
			else{
				pair++;
				arrset.remove(arr[i]);
			}
		}
		System.out.println(pair);
		
	}
	
	
	

}
