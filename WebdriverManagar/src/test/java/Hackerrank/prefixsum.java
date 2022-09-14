package Hackerrank;

public class prefixsum {
	
	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6,7};
		int sumofarray = sumofarray1(a, 0, 3);
		System.out.println(sumofarray);
		
	}
	
	// Approach 1:
	public static int sumofarray(int a[], int start, int end){
		
		int sum=0;
		for(int i=start;i<=end;i++){
			sum+=a[i];
		}
		
		return sum;
	}
	
	// Approach 2:
	public static int sumofarray1(int a[], int start, int end){
		
		int sum =a[end]+a[start];
		return sum;
	}

}
