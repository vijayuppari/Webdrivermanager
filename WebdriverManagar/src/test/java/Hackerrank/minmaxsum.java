package Hackerrank;

import java.util.Arrays;

public class minmaxsum {
	
	public static void main(String[] args) {
		
		//int arr[]={1,2,5,4,3};
		int arr[]={1,3,5,7,9};
		
		// min sum is= 1+3+5+7 =16;
		// max sum is =3+5+7+9=24
		minmaxsum1(arr);
	}
	
	public static void minmaxsum1(int arr[]){
		
		int sum=0;
		Arrays.sort(arr);	
		int min =arr[0];
		int max=arr[arr.length-1];
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println("Maximum Sum is " + (sum-min));
		System.out.println("Minium Sum is " + (sum-max));
		
	}
}
