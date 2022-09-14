package Java2blog;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(anagram("java", "avaj"));
		System.out.println(Anagram2strins("java", "svaj"));
		
	/*	String word1 = sort("java");
		String anagram1 =sort("avej");
		System.out.println(word1.equals(anagram1));
		*/
		
	}
	
	
	// Approach 1:
	public static boolean anagram(String word, String anagram){
		
		if(word.length()!=anagram.length()){
			return false;
		}
		for(int i=0;i<word.length();i++){
			char c = word.charAt(i);
			int index=anagram.indexOf(c);	
			
			if(index!=-1)
				anagram= anagram.substring(0,index)+anagram.substring(index+1,anagram.length());
			else
				return false;
		}
		return anagram.isEmpty();
	}
	
	
	
	// Approach 2:
	public static String sort(String word){
		char[] chararray =word.toLowerCase().toCharArray();
		Arrays.sort(chararray);
		return String.valueOf(chararray);
	}
	
	// Approach 3:
	public static boolean Anagram2strins(String str1,String str2){
		
		if(str1.length()!=str2.length()){
			return false;
		}
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		for(int j=0;j<str1.length();j++){
			if(charArray1[j]!=charArray2[j])
				return false;
		}
		return true;
	}
	
	
}
