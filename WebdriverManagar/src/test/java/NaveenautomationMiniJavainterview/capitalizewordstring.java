package NaveenautomationMiniJavainterview;

public class capitalizewordstring {
	
	
	public static void main(String[] args) {
		
		//String str="vijay kumar uppari";
		capitalizeString("vijay kumar uppari");
		
	}
	
	
	public static void capitalizeString(String str){
		
		String[] strsplit = str.split(" ");
		String s2="";
		for(String s1:strsplit){
			
			s2=s2+" "+ s1.substring(0,1).toUpperCase()+s1.substring(1).trim();
			
		}
		
		System.out.println(s2);
		
		
		
		
	}
	

}
