package Algorthims;

import java.util.Map;
import java.util.stream.Collectors;

public class duplicatecharsinjava8 {
	
	public static void main(String[] args) {
		
		String s="vijaykumaruppari";
		Map<String, Long> collect = s.chars().mapToObj(i->(char)i).filter(i->i>1).collect(Collectors.groupingBy(Object::toString,Collectors.counting())).entrySet().stream().filter(ele->ele.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		collect.forEach((k,v) ->System.out.println(k+"\t"+v));
		
	}
	
}
