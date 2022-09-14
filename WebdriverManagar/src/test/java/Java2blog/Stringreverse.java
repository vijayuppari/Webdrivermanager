package Java2blog;

import bsh.StringUtil;

public class Stringreverse {
	
	public static void main(String[] args) {
		
		/*strreverse("vijay");
		System.out.println(strreverserecu("vijay"));
		Strinbufferrever("vijay");*/
		
		System.out.println(rev("vijay"));
		
		
	}
	public static String rev(String str){
		if(str.length()<=1){
			return str;
		}
		return (str.charAt(str.length()-1)+rev(str.substring(0,str.length()-1)));	
		
	}
	
	// Approach 1:
	public static void strreverse(String str){
	
		String reverse="";
		for(int i=str.length()-1;i>=0;i--){
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		
	}
	
	// Approach 2:
	public static String strreverserecu(String str){
		if(str.length()==1)
			return str;
		else
			return str.charAt(str.length()-1)+strreverserecu(str.substring(0,str.length()-1));
	}
	
	// Approach 3:
	public static void Strinbufferrever(String str){
		StringBuffer sf= new StringBuffer(str);
		System.out.println(sf.reverse());
	}

}
