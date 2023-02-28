
public class dimension {
	
	
	public static void main(String[] args) {
		
		int arr[][]={
				{1,2,3},
				{4,5,6}
				};
		printspiralarray(arr);
	}
	
	
public static void printspiralarray(int arr[][]){
		
		//int num=1;
		for(int i=0;i<=arr.length-1;i++){
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
				//num++;
				i++;
			}
			System.out.println(" ");
			
			
		}
		
	}

}
