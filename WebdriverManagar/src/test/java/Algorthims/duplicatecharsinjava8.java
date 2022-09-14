package Algorthims;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicatecharsinjava8 {

	public static void main(String[] args) {

		String s = "vijaykumaruppari";

		Map<String, Long> collect12 = s.chars().mapToObj(i -> (char) i).filter(i -> i > 1)
				.collect(Collectors.groupingBy(Object::toString, Collectors.counting())).entrySet().stream()
				.filter(ele -> ele.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		collect12.forEach((k, v) -> System.out.println(k + "\t" + v));
		Object[] array = collect12.values().toArray();
		Arrays.sort(array);
		System.out.println(array[array.length-1]);

	}
	
	public static void main3123(String args[]){
		
		System.out.println(FirstNonrepeatedcharacter());
		LastNonrepeatedcharacter();
		
		//System.out.println(getlastkey());
		
		
	}
	
	public static Character FirstNonrepeatedcharacter(){
		
		/*// Approach 1:
		String str="vijaykumaruppari";
		for(Character ch:str.toCharArray()){
			if(str.indexOf(ch)==str.lastIndexOf(ch)){
				System.out.println("First Non repeating character is " + ch);
			}
		}*/
		
		// Approach 2:
		String str="vijaykumaruppariv";
		Character character = str.chars().mapToObj(i-> Character.toLowerCase(Character.valueOf((char)i))).
		collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).
		entrySet().stream().filter(ele->ele.getValue()==1).map(ele->ele.getKey()).findFirst().get();
		return character;
	}
	
	public static void LastNonrepeatedcharacter(){
		
		String str="vijay";
		HashMap<Character, Integer> lastchar= new HashMap<>();
		for(int i=0;i<=str.length()-1;i++){
			Character charArray = str.charAt(i);
			if(lastchar.containsKey(charArray)){
				lastchar.put(charArray, lastchar.get(charArray)+1);
			}
			else{
				lastchar.put(charArray, 1);
			}
		}
		
		// Find Last Character: for(int i=str.length()-1;i>=0;i--){
		// Find First Character: 
		for(int i=0;i<=str.length()-1;i++){
			char currentchar = str.charAt(i);
			Integer currentfre = lastchar.get(currentchar);
			if(currentfre==1){
				System.out.println(currentchar);
				break;
			}
			
		}
		
		
		
		
		
	}
	
	public void repeat(){
		
		String s="vijaykumar";
		s.chars().mapToObj(i->(char)i).filter(i->i>1).collect(Collectors.groupingBy(Object::toString,Collectors.counting())).
		entrySet().stream().filter(ele->ele.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}
	
	
	
	
}


