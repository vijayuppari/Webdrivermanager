package Java2blog;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class findduplicatecharinstring {

	public static void main(String[] args) {

		String str = "vijaykumarvikky";
		//countumberofchars123(str);
		countumberofchars1234(str,'a');
		//countnumberofhcars(str);

	}
	
	// Approach 1:

	public static void countumberofchars(String str) {

		HashMap<Character, Integer> hmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else
				hmap.put(c, 1);
		}

		for (Character c : hmap.keySet()) {
			if (hmap.get(c) >= 1) {
				System.out.println("Character is " + "" + c + "" + "  Number of times repated is " + hmap.get(c));
			}
		}
	}
	
	public static void countumberofchars123(String str) {

		HashMap<Character, Integer> hmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else
				hmap.put(c, 1);
		}
		
		 /*Set<Character> keySet = hmap.keySet();
		for(Character ele:keySet){
			if(hmap.get(ele)>1){
				System.out.println("Character is " + "" + ele + "" + "  Number of times repated is " + hmap.get(ele));
			}
		}*/
		Set<Entry<Character, Integer>> entrySet = hmap.entrySet();
		int maxount=0;
		char char1=0;
		for(Entry<Character, Integer> en:entrySet){
			
			if(en.getValue()>maxount){
				char1 =en.getKey();
				maxount =en.getValue();
			}
				}
			System.out.println("Character is " + "" + char1 + "" + "  Number of times repated is " +maxount);
		
	}
	
	public static void countumberofchars1234(String str, char j) {

		HashMap<Character, Integer> hmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else
				hmap.put(c, 1);
		}
		
		Set<Entry<Character, Integer>> entrySet = hmap.entrySet();
		int maxount=0;
		char char1=0;
		for(Entry<Character, Integer> en:entrySet){
			
			if(en.getKey()==j){
				char1 =en.getKey();
				maxount =en.getValue();
			}
				}
			System.out.println("Character is " + "" + char1 + "" + "  Number of times repated is " +maxount);
		
	}

	
// Approach 2:
	
	public static void countnumberofhcars(String str){
		
		Map<String, Long> collect12 = str.chars().mapToObj(i->(char)i).filter(i->i>1).collect(Collectors.groupingBy(Object::toString,Collectors.counting())).entrySet()
				.stream().filter(ele->ele.getValue()>1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		collect12.forEach((k,v)->System.out.println(k+ "\t"+ v));	
	}
	
	
public static void duplicates(String str){
	
	Map<String, Long> collect1 = str.chars().mapToObj(i->(char)i).filter(i->i>1).collect(Collectors.groupingBy(Object::toString,Collectors.counting())).entrySet().stream()
	.filter(ele->ele.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	collect1.forEach((k,v)-> System.out.println(k+"\t"+v));
	
}
	}