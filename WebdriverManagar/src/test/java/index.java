
public class index {
	
	
	
	public static void main(String[] args) {
		
		int arr[]= new int[]{2,3,4,5,7};
		
		int val= 6;
		
		for(int i=0;i<=arr.length-1;i++){
			if(val==arr[i]){
				System.out.println(arr[i] + " is at index number" + i);
				break;
			}
			if(val<arr[i]){
				System.out.println(i);
				
			}
		}
		
		
	}

}
