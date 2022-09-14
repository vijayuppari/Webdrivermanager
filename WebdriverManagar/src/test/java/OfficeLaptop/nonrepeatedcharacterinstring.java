
package OfficeLaptop;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Optional;

public class nonrepeatedcharacterinstring {
	
	public static void main(String[] args) {
		
		Optional<Character> nonrepeatchar = Nonrepeatchar("SVDEVSK");
		if(nonrepeatchar.isPresent()){
			System.out.println("Non repeating Character is "+ nonrepeatchar.toString());
		}
		else{
			System.out.println("There is no Non repetted character");
		}
		
	}
	
	
	
	public static Optional<Character> Nonrepeatchar(String str){
		
		HashMap<Character, Integer> nonrepeat = new HashMap<>();
		//char[] charArray = str.toCharArray();
		//for(int i=0;i<=str.length()-1;i++){
		for(int i=str.length()-1;i>=0;i--){
			char c = str.charAt(i);
			if(!nonrepeat.containsKey(c)){
				nonrepeat.put(c, 1);
			}
			else{
				nonrepeat.put(c, nonrepeat.get(c)+1);
			}
		}
		
		for( Entry<Character, Integer> entry: nonrepeat.entrySet()){
			if(entry.getValue()==1){	
				return Optional.of(entry.getKey());
			}
		}
		return Optional.ofNullable(null);
		
		
		
		
	}

}
