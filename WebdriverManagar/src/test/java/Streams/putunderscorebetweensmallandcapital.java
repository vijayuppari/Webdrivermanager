package Streams;

import com.google.common.base.Ascii;

public class putunderscorebetweensmallandcapital {
	
	public static void main(String[] args) {
		
		String s="VijayKumarUppari";
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<s.length();i++){
			
			if(Character.isUpperCase(s.charAt(i))){
				sb.append("_");
				sb.append(s.charAt(i));
			}
			else{
				sb.append(s.charAt(i));
			}		
		}
		String result =sb.toString();
		System.out.println(result);
		
		/*char character = 'A';    
		int ascii = (int) character;
		System.out.println(ascii);*/
		
		
	}
	
	// String is Immutable
	// Because of Using Strings in different places Security
	// Heap Memory save
	//

}
