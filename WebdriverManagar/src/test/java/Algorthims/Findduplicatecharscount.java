package Algorthims;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Findduplicatecharscount {
	
	public static void main(String[] args) {
		
		findduplicates("vijaykumaruppari");
	}
	
	public static void findduplicates(String str){
		char[] totalchars = str.toCharArray();
		Map<Character, Integer> chamap = new HashMap<Character, Integer>();
		for(Character ch:totalchars){
			if(chamap.containsKey(ch)){
				chamap.put(ch, chamap.get(ch)+1);
			}
			else
				chamap.put(ch, 1);		
		}
		
		Set<Character> keySet = chamap.keySet();
		for(Character key:keySet){
			if(chamap.get(key)>1){
				System.out.println("Character is " +  key+" "  +chamap.get(key));
			}
		}
		
		
		
	}

}
