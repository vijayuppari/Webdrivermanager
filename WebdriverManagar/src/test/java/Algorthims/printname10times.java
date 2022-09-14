package Algorthims;

public class printname10times {
	
	public static void printname(){
		
		String name="vijay";
		String s="i";
		s=s.replaceAll("i", "iiiiiiiiii");
		s=s.replaceAll("i", name +"\n");
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		printname();
	}

}
