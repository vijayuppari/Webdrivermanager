package Algorthims;

import java.util.Arrays;

public class FindLargestnumber {
	
	public static void main(String[] args) {
		
		int num[]={10,19,90,78,100,190};
		Arrays.sort(num);
		int i = num[num.length-1];
		System.out.println(i);
		
	}

}
