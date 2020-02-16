package Algorthims;

public class reversetring {
	
	public static void main(String[] args) {
		//reversestring("vijay");
		//reversetring1("vijay");
		reverse3();
	}
	// Approach 1:
	public static void reversestring(String str){
		char[] chars = str.toCharArray();
		int charslength = chars.length;
		for(int i=charslength-1;i>=0;i--){
			System.out.print(chars[i]);
		}	
	}
	
	// Approach 2:
	
	public static void reversetring1(String str){
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	
	// Approach 3
	public static void reverse3(){
		
		StringBuffer sb= new StringBuffer("vijay");
		System.out.println(sb.reverse());
	}

}
