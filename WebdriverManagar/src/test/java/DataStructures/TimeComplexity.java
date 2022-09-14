package DataStructures;

public class TimeComplexity {
	
	// Big O;
	// O(1), O(n), O(n2), O(n3) and O(nlogn), O(2^n);
	// N - is the input size
	// O(1) and O(n)=> are Linear Equation
	public static void main(String[] args) {
		
		// O(1)
		int i=10;
		System.out.println(i); // Time Complexity is - O(1)
		// O(1)
		int num=20;// Time complexity is O(1)
		if(num%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
		
		//O(n)
		for(int k=1;k<10;k++){
			System.out.print(k);
		}
		
		// For above for loop time complexity is O(n)
		// explanation: k=1 (1)+ k<=10(n)+k++(n)+sysouot(n)=> 1+n+n+n=1+3n=> n
		
		//O(n)
		int arr[]={30,89,10,73,100,34};
		int max=arr[0];
		int min=arr[0];
		for(int j=0;j<arr.length;j++){
			if(arr[j]>max){
				max=arr[j];
			}else if (arr[j]<min){
				min=arr[j];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		//O(n^2)
		
		for(int x=0;x<=3;x++){ //1+n+n
			for(int y=0;y<=3;y++){// 1+n+n+n
				System.out.print(x+""+y+ " ");
			}
			System.out.println();
		}
		// (1+2n)(1+3n)=> 1+3n+2n+6n^2=> 1+5n+6n^2=> O(n^2)
		// O(n2)=> This Querdric Equation
		
		// If 3 for loops are available then n*n*n (O(n3))
		
		
		
		
		
	}
	
	

}
