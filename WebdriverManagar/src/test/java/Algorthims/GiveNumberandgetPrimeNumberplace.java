package Algorthims;

import java.util.ArrayList;
import java.util.List;

public class GiveNumberandgetPrimeNumberplace {
	
	
	
	public static void main(String[] args) {
		
		
		primeplace(6, 100);
		
		
	}
	
	
	public static void primeplace(int place, int total){
		
		
		// Input : 5
		//Output : 11
		//int j=0;
		List<Integer> ls = new ArrayList<>();
		for(int i=2;i<=total;i++){
			boolean isprime = true;
			for(int j=2;j<i;j++){
			if(i%j==0){
				isprime=false;
				break;
				}
			}
			if(isprime){
				ls.add(i);
			}
		}
			System.out.println(ls.get(place-1));
	}

}
