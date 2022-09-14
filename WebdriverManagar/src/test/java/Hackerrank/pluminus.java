package Hackerrank;

public class pluminus {
	
	public static void main(String[] args) {
		
		int arr[]={-4,3,6,-8,0,-2};
		plusminus(arr);
		
	}
	
	public static void plusminus(int arr[]){
		
		int n =arr.length;
		float positvecount=0,negetivecount=0,zeroscount=0;
		for(int i=0;i<n;i++){
			int element=arr[i];
			if(element>0){
				positvecount++;
			}
			if(element<0){
				negetivecount++;
			}
			if(element==0){
				zeroscount++;
				
			}
		}
		
		System.out.println("Positve count " + positvecount/n + " Negetive count " + negetivecount/n  + " Negetive count " + zeroscount/n);
		
		
	}

}
