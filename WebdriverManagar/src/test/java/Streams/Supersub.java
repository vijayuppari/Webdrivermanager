package Streams;

public class Supersub extends Super {
	
	String color="White";
	
	public void printcolor(){
		
		System.out.println("Dog color " + color);
		System.out.println("super class Dog color " + super.color);
	}
	
	void eat(){
		super.eat();
		System.out.println("Child class Dog is eating");
		
	}
	
	public static void main(String[] args) {
		
		Supersub sb= new Supersub();
		sb.printcolor();
		sb.eat();
		
		
	}

}
