package NaveenautoamtionLabs;

public class ReverseOfString {
	
	public static void main(String[] args) {
		
		reverseString("Vijay");
		reverseStringUsingloop("Vijay");
		usingSringBuffer("Vijay");
		
	}
	
	
	//Approach 1:
	public static void reverseString(String str){
		
		char[] charArray = str.toCharArray();
		int strlength = str.length();
		for(int i=strlength-1;i>=0;i--){
			System.out.print(charArray[i]);
		}
	}
	
	// Approach 2:
	public static void reverseStringUsingloop(String str){
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		String reverse="";
		for(int i=str.length()-1;i>=0;i--){
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		
	}
	
	// Approach 3:
	public static void usingSringBuffer(String str){
		StringBuffer sb= new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
