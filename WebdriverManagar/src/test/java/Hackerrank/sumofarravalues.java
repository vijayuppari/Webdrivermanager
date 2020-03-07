package Hackerrank;

import java.util.Arrays;

public class sumofarravalues {
	
	public static void main(String[] args) {
		
		int a[]={1,2,3,4};
		System.out.println(sumofvaluesinarray(a));
		sumarrayjava8(a);
		
	}
	
	public static int sumofvaluesinarray(int a[]){
		
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		return sum;
	}
	
	//JAVA 8
	
	public static void sumarrayjava8(int a[]){
		
		System.out.println(Arrays.stream(a).sum());
		System.out.println(Arrays.stream(a).count());
		
		
	}
	

}
