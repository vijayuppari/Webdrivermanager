package Hackerrank;

public class Birthdaycandles {
	
	public static void main(String[] args) {
		
		int arr[]={3,2,4,2,4,4,4,2,2,2,5,5,5,5,5,6,7,7,7};
		System.out.println(maxheightofcandles(arr));
		
	}

	public static int maxheightofcandles(int arr[]){
		
		int maximumheightcandles=Integer.MIN_VALUE;
		int candlesfreqcount=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==maximumheightcandles){
				candlesfreqcount++;
			}
			if(arr[i]>maximumheightcandles){
				maximumheightcandles=arr[i];
				candlesfreqcount=1;
			}
		}
		return candlesfreqcount;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
