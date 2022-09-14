package NaveenautoamtionLabs;

import java.util.regex.Pattern;

public class Substringpresentingivenstring {
	
	public static void main(String[] args) {
		
		System.out.println(substringpresent("Vijay Kumar Junnu Uppari", "Junnu"));
		
		
	}
	
	// Approach 1: using Regx
	public static boolean substringpresent(String str, String sub){
		
		Pattern compile = Pattern.compile(sub);
		java.util.regex.Matcher matcher = compile.matcher(str);
		while(matcher.find()){
			return true;
		}
		return false;
		
	}

}
