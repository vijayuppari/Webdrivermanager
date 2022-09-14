package NaveenautoamtionLabs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class arraytoString {
	
	
	public static void main(String[] args) {
		
		String arr[]={"v","i","j","a","y"};
		
		// with delimiter as ";"
		String join = String.join(";", arr);
		System.out.println(join);
		
		// without  delimiter as ";"
		String join1 = String.join("", arr);
		System.out.println(join1);
		
		// Using streams-- Strings
		String collect = Arrays.asList("v","i","j","a","y").stream().collect(Collectors.joining());
		System.out.println(collect);
		
		// Using streams-- integers
		String collect1 = Arrays.asList(1,2,90,390,198).stream().map(s->String.valueOf(s)).collect(Collectors.joining(" "));
		System.out.println(collect1);
		
	}

}
