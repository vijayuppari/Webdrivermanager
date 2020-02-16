package Algorthims;

public class Arraysequalwithoutinbuiltfunction {
	
	public static void main(String[] args) {
		
		String a[] = { "vijay", "nani", "java" };
		String b[] = { "vijay", "nani", "java" };
		System.out.println(arraysequality(a, b));
		
	}
	
	public static boolean arraysequality(String a[], String b[]){
		if(a.length!=b.length){
			return false;
		}
		else
			for(int i=0;i<=a.length-1;i++){
				if(a[i]!=b[i]){
					return false;
				}
			}
		return true;
	}

}
