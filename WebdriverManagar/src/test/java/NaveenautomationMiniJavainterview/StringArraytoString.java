package NaveenautomationMiniJavainterview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringArraytoString {
	
	
	public static void main(String[] args) {
		
		
		String arr[]= {"V","i","j","a","y"};
		
		System.out.println(String.join("", arr));
		
		System.out.println(String.join(";", arr));
		
		String collect = Arrays.asList("v","i","j","a","y").stream().collect(Collectors.joining());
		System.out.println(collect);
		
		String x="abc";
		String y="abc";
		
		x.concat(y);
		System.out.println(x);
		
		
	}

}
