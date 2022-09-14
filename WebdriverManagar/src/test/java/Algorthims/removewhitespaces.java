package Algorthims;

public class removewhitespaces {
	
	public static void main(String[] args) {
		//removewhitespaces("vijay kumar uppari");
		removespaces("vijay kumar uppari");
	}
	
	// Approach 1:
	public static void removewhitespaces(String str){
		
		String s="";
		for(int i=0;i<=str.length()-1;i++){
			if(str.charAt(i)!=' '){
				s=s+str.charAt(i);	
			}
		}
		System.out.println(s);
		
	}
	
	// Approach 2:
	public static void removespaces(String str){
		
		System.out.println(str.replaceAll(" ", ""));
		
	}

}
