package techiedelight;

import java.util.HashMap;
import java.util.Map;

public class pairwithgievensum {
	
	// int a[]={2,3,5,9,6,4}
	// int sum=10
	
	public static void main(String[] args) {
		 int a[]={2,3,5,9,6,4};
		 int sum=11;
		//pairwithsum(a, sum);
		 pairindexhashing(a, sum);
	}
	
	//Approach 1:
	public static void pairwithsum(int a[],int sum){
		
		for(int i=0;i<=a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==sum){
					System.out.println("Starting Index as " + i + " and ending index as " + j);
					return;
				}
					
			}	
		}
		System.out.println("No Pair found with this sum");
	}
	
	
	// Approach 2:
	
	public static void pairindexhashing(int a[], int sum){
		
		Map<Integer,Integer> pairmap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if(pairmap.containsKey(sum-a[i])){
				System.out.println("Pair found at index " + pairmap.get(sum-a[i])+ " and " + i );
				return;
				
			}
			pairmap.put(a[i], i);
		}
		System.out.println("No Pair Found");
	}
}
