package NaveenautoamtionLabs;

import java.util.stream.IntStream;

public class Print1to100withoutusingnumbers {
	
	public static void main(String[] args) {
		
		//printnum1();
		//printnum2();
		printnum3();
		
	}
	
	
	// Approach 1:
	public static void printnum1(){
		
		int one='A'/'A';
		String s="..........";
		for(int i=one;i<=(s.length()*s.length());i++){
			System.out.println(i);
		}
	}
	
	//Approach 2:
	public static void printnum2(){
		
		int one='A'/'A';
		int hundred='d';
		for(int i=one;i<=hundred;i+=one){
			System.out.println(i);
		}
	}
	
	//Approach 3:
	public static void printnum3(){
		IntStream.range(1, 101).forEach(System.out::println);
	}

}
