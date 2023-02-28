package Algorthims;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Findduplicatecharscount {
	
	public static void main(String[] args) {
		
		findduplicates("abbcccd");
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
		
		// for loop
		System.out.println("*************** Using For Loop ***************");
		Set<Character> keySet = chamap.keySet();
		for(Character key:keySet){
			if(chamap.get(key)>1){
				System.out.println("Character " +  key+" is "  +chamap.get(key));
				//System.out.print(chamap.get(key)+key);
			}
		}
		
		// keyset with : iterator
		System.out.println("*************** Using Iterator ***************");
		Iterator<Character> its = chamap.keySet().iterator();
		while(its.hasNext()){
			Character ch = its.next();
			if(chamap.get(ch)>1){
				System.out.println(ch + " "+ chamap.get(ch));
			}
		}
		
		// entryset
		System.out.println("*************** Using EntrySet ***************");
		
		Set<Entry<Character, Integer>> entrySet1 = chamap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet1){
			if(entry.getValue()>1){
				System.out.println("Key is " + entry.getKey() + " " + entry.getValue());
			}
			
		}
	}

}
