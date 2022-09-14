package Streams;

public class Spledorsubclass  extends Vehchile{
	
	int speed=150;
	
	public void run(){
		System.out.println("Spledor speed is 60 km with Safety");
	}
	
	public static void main(String[] args) {
		
		Spledorsubclass spl= new Spledorsubclass();
		spl.run();
		
		Vehchile vh= new Vehchile();
		vh.run();
		
		// Run time Polymorphism or Dynamic Polymorphism: Upcasting
		
		Vehchile vh12= new Spledorsubclass();
		vh12.run();
		
		//Run time Polymorphism achivable only for methods not for datamembers
		// For example
		Vehchile vh45= new Spledorsubclass();
		System.out.println(vh45.speed);
		
		
	}

}
