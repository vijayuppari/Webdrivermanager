package Hackerrank;

import java.util.Arrays;

public class Leftrottion {
	
	public static String leftarray(int[] arr, int d){
		
		int n =arr.length;
		int rotatearr[] = new int[n];
		for(int oldindex=0;oldindex<n;oldindex++){
			int newindex= (oldindex+n-d)%n;
			rotatearr[newindex] = arr[oldindex];
		}
		
		return Arrays.toString(rotatearr);
		
	}
	
	public static void main(String[] args) {
		int[] arr= new int[]{1,2,3,4,5};
		System.out.println(leftarray(arr, 2));
	}

}


//2,1,3,4,5
