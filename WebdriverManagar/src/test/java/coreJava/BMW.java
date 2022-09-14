package coreJava;

public class BMW extends Vechile{
	
	public void fuel(){
		System.out.println("Fuel is in BMW ");
	}
	
	public void start(){
		System.out.println("Auto start in BMW");
	}
	
	public static void main(String[] args) {
		
		
		BMW bmw = new BMW();
		bmw.start();
		
		Vechile vechile = new Vechile();
		vechile.start();
		
		// Upcasting
		Vechile obj = new BMW();
		obj.start();
		
		// down casting
		BMW obj1 = (BMW) new Vechile();
		obj1.start();
		
	}

}
