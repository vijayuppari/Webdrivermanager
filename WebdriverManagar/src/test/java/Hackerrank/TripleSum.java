package Hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TripleSum {
	
	public static void main(String[] args) {
		
		int a[]={3,5,7,7,1,1};
		int b[]={7,5,9};
		int c[]={7,9,11,11,13};
		long triplesum = triplesum(a, b, c);
		System.out.println(triplesum);
		
	}
	
	
	public static long triplesum(int a[], int b[], int c[]){
		
		long duplicatetriletcount=0;
		int[] distinctA = removeduplictes(a);
		int[] distinctB = removeduplictes(b);
		int[] distinctC = removeduplictes(c);
		
		Arrays.sort(distinctA);
		Arrays.sort(distinctB);
		Arrays.sort(distinctC);
		
		for(int q:distinctB){
			long c1=getvalidindex(distinctA,q)+1;
			long c2=getvalidindex(distinctC, q)+1;
			duplicatetriletcount+=c1*c2;
		}
		return duplicatetriletcount;
		
		
	}
	
	private static int getvalidindex(int[] distinctA, int key) {
		int low=0;
		int high= distinctA.length-1;
		int count=-1;
		while(low<=high){
			int mid= low+(high-low)/2;
			if(distinctA[mid]<=key){
				count=mid;
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return count;
	}


	public static int[] removeduplictes(int arr[]){
		
		Set<Integer> set= new HashSet<>();
		for(int item:arr){
			set.add(item);
		}
		int len= set.size();
		int i=0;
		int result[] = new int[len];
		for(int item:set){
			result[i++]= item;
		}
		return result;
	}
	

}
