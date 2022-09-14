package Algorthims;

public class Stringpermutations {
	
	public static void main(String[] args) {
		
		String str="ABC";
		int n =str.length();
		permute(str, 0, n-1);
		
	}



public static void permute(String str, int start, int end){
		
	if(start==end){
		System.out.println(str);
	}
	for(int i=start;i<=end;i++){
			str= swap(str, start, i);
			permute(str, start+1, end);
			str=swap(str, start, i);
	}
	
}

public static String swap(String str, int i, int j){
	
	char temp;	
	char[] charArray = str.toCharArray();
		temp= charArray[i];
		charArray[i]= charArray[j];
		charArray[j]= temp;
		return String.valueOf(charArray);
	
}

}