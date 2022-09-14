package Algorthims;

public class Palindromusingrecursion {
	
	public static void main(String[] args) {
		System.out.println(ispalindrom("vijay"));
		System.out.println(ispalindrom("ABCDCBA"));
	}
	
	
	public static boolean ispalindrom(String word){
		String reverseword =getreverseword(word);
		if(reverseword.equals(word)){
			return true;
		}
		return false;
	}
	
	
	public static String getreverseword(String word){
		if(word==null || word.isEmpty()){
			return word;
		}
		return word.charAt(word.length()-1)+getreverseword(word.substring(0,word.length()-1));
		
	}

}
