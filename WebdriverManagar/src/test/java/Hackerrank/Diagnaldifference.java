package Hackerrank;

import java.util.HashSet;

public class Diagnaldifference {
	
	public static void main(String[] args) {
		
		/*int arr[][]=new int [3][3];
		arr[1][1]={1,2,3};*/
		
		int arr[][]={
					{1,2,3},
					{4,5,6},
					{8,9,4}
					};
		diagnldiff(arr);
		
	}
	
	public static void diagnldiff(int arr[][]){
		
		int leftsum=0,rightsum=0;
		for(int i=0;i<=arr.length-1;i++){
			
			leftsum+=arr[i][i];
			rightsum+=arr[i][arr.length-1-i];
		}
		System.out.println(Math.abs(rightsum-leftsum));
	}

}
