package Algorthims;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class FindLargestnumber {
	
	public static void main(String[] args) {
		
		/*// Largest Number
		int num[]={10,19,90,78,100,190};
		Arrays.sort(num);
		int i = num[num.length-1];
		System.out.println(i);
		
		// First 3 largest numbers
		int i;
		Arrays.sort(num);
		for(i=num.length-1;i>3;i--){
			System.out.println(num[i]);
		}*/
		
		duplicates("vivjaykumaruppari");
		
	}
	
	
	
	public static void duplicates(String s){
		
		
		HashMap<Character, Integer> hmap = new HashMap<>();
		char[] charArray1 = s.toCharArray();
		for(char c: charArray1){
			if(hmap.containsKey(c)){
				hmap.put(c, hmap.get(c)+1);
			}else{
				hmap.put(c, 1);
			}
		}
		
		/*et<Character> keySet = hmap.keySet();
		for(char k: keySet){
			if(hmap.get(k)>1){
				System.out.println("Character " + k + "is" +hmap.get(k));
			}
		}*/
		
		for(int i=0;i<=s.length()-1;i++){
			char c = s.charAt(i);
			if(hmap.get(c)==1){
				System.out.println(c);
				break;
			}
			
		}
		
	}

}
