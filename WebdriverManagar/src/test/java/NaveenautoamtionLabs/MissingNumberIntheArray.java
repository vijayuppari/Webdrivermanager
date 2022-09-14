package NaveenautoamtionLabs;

public class MissingNumberIntheArray {
	
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{1,3,4,5,6,7,8};
		MissingNumberIntheArray missingNumberIntheArray= new MissingNumberIntheArray();
		missingNumberIntheArray.missingnumber(arr);
	}
	
	public void missingnumber(int arr[]){
		
		int sum=0,sum1=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		for(int j=1;j<=8;j++){
			sum1=sum1+j;
		}
		
		System.out.println(sum1-sum);
		
		
		
	}

}
