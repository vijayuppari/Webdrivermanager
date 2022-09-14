package Hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Iccecreaprlour {
	
	public static void main(String[] args) {
		//length of an array : 5
		// sum is 7
		// arr[]= {1,2,3,4,5}
		int arr[]={1,2,3,4,5};
		int[] icecream = icecream(arr, 5);
		Arrays.stream(icecream).forEach(System.out::println);
		
	}
	
	public static int[] icecream(int arr[], int m){
		
		int result[] = new int [2];
		Map<Integer, Integer> icemap= new HashMap<Integer, Integer>();
		for(int i=0;i<=arr.length-1;i++){
			int x=arr[i];
			int y=m-x;
			Integer j = icemap.get(y);
			if(j!=null){
				result[0]=j+1;
				result[1]=i+1;
				break;
			}
			icemap.put(x, i);
		}
		return result;
	}

}
