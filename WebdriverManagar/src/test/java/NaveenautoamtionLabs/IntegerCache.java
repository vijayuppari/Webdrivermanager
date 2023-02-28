package NaveenautoamtionLabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.lang.model.element.Element;

public class IntegerCache {
	
	public static void main(String[] args) {
		
		// Integer cache = -128 to 127
		
		Integer num1=120;
		Integer num2=120;
		if(num1==num2)
			System.out.println("Both are Equal");
		else
			System.out.println("Both are Not Equal");
		
		System.out.println("************************************************************8");
		// Remove
		List<Integer> ls= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,9,10));
		ls.removeIf(ele->ele%2==0);
		System.out.println(ls);
		
		// Get words count
		
		String s="VijayKumarUpparinani";
		long count =s.chars().filter(ele->Character.isUpperCase(ele)).count();
		System.out.println(count);

		highpalindrom(1, 200);
		
		
	}
	
	
	
	public static int Ispalindrom(int num){
		
		int sum=0;
		int num1=num;
		
		while(num>0){
			int reminder =num%10;
			
			sum=(sum*10)+reminder;
			num=num/10;
		}
		return (sum==num1)?1:0;		
	}
	
	public static void highpalindrom(int min,int max){
		
		List<Integer> ls= new ArrayList<>();
		for(int i=min;i<=max;i++){
			if(Ispalindrom(i)==1){
				ls.add(i);
			}
		}
		System.out.println(Collections.max(ls));
		
	}

}
