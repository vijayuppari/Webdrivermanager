package Hackerrank;

public class palindromindex {
	
	//String s="caaa";
	
	public static void main(String[] args) {
		
		System.out.println(ispalindro("aaa"));
		//System.out.println(palindrom("caaa"));
		//System.out.println(palindrom("aaac"));
		//System.out.println(palindrom("aaa"));
	}
	
	public static int palindrom(String s){
		int palindromindex=-1;
		int len =s.length();
		for(int i=0;i<len/2;i++){
			if(s.charAt(i)!=s.charAt(len-i-1)){
				
				
				if(i+1<len){
					boolean ispal = ispalindro(s.substring(i+1,len-i));
					if(ispal)
						return i;
					return len-i-1;
				}
			}
		}
		return palindromindex;	
		
	}
	
public static boolean ispalindro(String str){
	
	int len =str.length();
	for(int i=0;i<len/2;i++){
		if(str.charAt(i)!=str.charAt(len-i-1))
			return false;
		return true;
	}
	return false;
	
}
	
	
}
