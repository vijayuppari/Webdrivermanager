package Hackerrank;

public class windowslide {

	
	public static void main(String[] args) {
		
		int arr[]={1,9,-1,-2,7,3,-1,2};
		System.out.println(slide(arr, 4));
		
	}
	
	// Approach 1: time complexity is O(n2)
	public static int slide(int arr[], int k){
		
		int maxsum=0;
		for(int i=0;i<arr.length-k;i++){
			int winsum=0;
			for(int j=i;j<i+k;j++){
				winsum+=arr[j];
			}
			maxsum=Math.max(maxsum, winsum);
		}
		return maxsum;	
	}
	
	
}
