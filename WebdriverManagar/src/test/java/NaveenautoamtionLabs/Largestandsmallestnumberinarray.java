package NaveenautoamtionLabs;

import java.util.Arrays;

public class Largestandsmallestnumberinarray {
	
	public static void main(String[] args) {
		
		int arr[]= new int[]{10,23,67,89};
		//largestandSmallest(arr);
		largestandsmallestwithotsort(arr);
		
	}
	
	
	// Approach 1
	public static void largestandSmallest(int arr[]){
		
		Arrays.sort(arr);
		//Largest Number in the Array
		int a =arr[arr.length-1];
		System.out.println(a);
		// Smallest Number in the Array
		System.out.println(arr[0]);
		
	}
	
	// Approach 2:
	public static void largestandsmallestwithotsort(int arr[]){
		
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				largest=arr[i];
			}
			else if(arr[i]<smallest){
				smallest=arr[i];
			}
		}
		
		System.out.println("Largest Number in the given Array " + largest);
		System.out.println("Smallest Number in the given Array " + smallest);
		
	}

}
