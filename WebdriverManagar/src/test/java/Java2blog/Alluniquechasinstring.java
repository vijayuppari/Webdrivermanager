package Java2blog;

import java.util.HashSet;

public class Alluniquechasinstring {
	
	public static void main(String[] args) {
		
		System.out.println(uniquehshset("vijaykumar"));
		System.out.println(uniqueistring("vijaykumar"));
		
	}
	
	
	// Approach 1: Using Hash Set
	public static boolean uniquehshset(String word){
		
		HashSet<Character> hs= new HashSet<>();
		for(int i=0;i<word.length();i++){
			char c = word.charAt(i);
			if(!hs.add(c))
				return false;
		}
		return true;
	}
	
	// Approach 2: Using indexof and lastindexof
	public static boolean uniqueistring(String word){
		
		for(int i=0;i<=word.length();i++){
			char c = word.charAt(i);
			if(word.indexOf(c)!=word.lastIndexOf(c)){
				return false;
			}
		}
		return true;
	}
	
	

}
