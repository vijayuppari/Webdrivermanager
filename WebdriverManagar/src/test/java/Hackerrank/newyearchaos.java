package Hackerrank;

public class newyearchaos {
	
	//number of steps required to swap the sequence
	
	public static void main(String[] args) {
		
		int arr[]={1,2,3,5,4,6,8,7};
		numberofswaps(arr);
		
	}
	
	public static void numberofswaps(int arr[]){
		int swapcount=0;
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]!=i+1){
				if(((i-1)>=0) && arr[i-1]==(i+1)){
					swapcount++;
					swap(arr,i,i-1);
				}
				else if((i-2)>=0 && arr[i-2]==(i+2)){
					swapcount+=2;
					swap(arr, i-2, i-1);
					swap(arr, i-1, i);
				}
				else{
					System.out.println("Too  Chattoic");
					return;
				}	
			}	
		}
		System.out.println("Total Swap Count "  + swapcount);
	}

	private static void swap(int[] arr, int a, int b) {
		
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;	
	}
}
