package Algorthims;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class reversenumberusingrecursion {
	
	
	public static void reverse(int num){
		if(num!=0){
			System.out.print(num%10);
			reverse(num/10);
		}
	}
	
	public static void main(String[] args) {
		//reverse(10);
		digitscount(12333);
	}
	
	
	public static void digitscount(int num){
		
		HashMap<Integer, Integer> digimap= new HashMap<>();
		while(num!=0){
			
			int reqnumber =num%10;
			if(digimap.containsKey(reqnumber)){
				digimap.put(reqnumber, digimap.get(reqnumber)+1);
			}
			else{
				digimap.put(reqnumber,1);
			}
			
			num=num/10;
		}
		
		
		Set<Integer> digiset = digimap.keySet();
		for(Integer digi:digiset){
			if(digimap.get(digi)>=1){
				System.out.println("Digits count " + digi + " :"+  digimap.get(digi));
			}
		}
	}

}
