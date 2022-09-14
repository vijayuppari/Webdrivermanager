package NaveenautoamtionLabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hamcrest.core.Is;

public class largestPalidromingivenrange {
	
	public static void main(String[] args) {
		
		//System.out.println(Ispalindrom(123));
		//System.out.println(Ispalindrom(121));
		
		highestpalindrom(1, 200);
		
	}
	
	
	
	public static int Ispalindrom(int num){
		
		int sum=0;
		int num1=num;
		while(num>0){
			
			int reminder =num%10;
			sum =(sum*10)+reminder;
			num=num/10;
		}
		return (sum==num1)?1:0;
	}
	
	public static void highestpalindrom(int min, int max){
		
		List<Integer> ls= new ArrayList<>();
		for(int i=min;i<=max;i++){
			if(Ispalindrom(i)==1){
				ls.add(i);
			}
		}
		System.out.println(Collections.max(ls));
		
	}
	

}
