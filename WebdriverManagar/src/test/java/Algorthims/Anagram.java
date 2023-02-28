package Algorthims;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		Anagrams("keep", "peek24");
		Anagrams("keep", "fafa");
		
	}
	
	
	
	public static void Anagrams(String str1, String str2){
		
		boolean status=true;
		if(str1.length()!=str2.length()){
		}
		else{
		char[] ch1 =str1.toLowerCase().toCharArray();
		char[] ch2 =str2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		status = Arrays.equals(ch1, ch2);}
		
		if(status){
			System.out.println("Both Strings are Anagram " + status);
		}
		else{
			System.out.println("Both Strings are not Anagrams " + status);
		}	
	}
}
