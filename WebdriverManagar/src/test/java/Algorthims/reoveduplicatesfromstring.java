package Algorthims;

import java.util.HashSet;
import java.util.Set;

public class reoveduplicatesfromstring {
	
	public static void main(String[] args) {
		
		String s="vijaykumaruppari";
		Set<Character> s1= new HashSet<Character>();
		StringBuffer sb= new StringBuffer();
		for(char s12:s.toCharArray()){
			if(!s1.contains(s12)){
				s1.add(s12);
				sb.append(s12);
			}
		}
		System.out.println(sb.toString());
	}
	
}
