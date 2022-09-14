package NaveenautoamtionLabs;

public class Swappingof2strings {
	
	public static void main(String[] args) {
		
		
		String a= "Vijay";
		String b= "Kumar";
		
		System.out.println("Before Swapping a will be " + a);
		System.out.println("Before Swapping b will be " + b);
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("After Swapping a will be " + a);
		System.out.println("After Swapping b will be " + b);
	}

}
