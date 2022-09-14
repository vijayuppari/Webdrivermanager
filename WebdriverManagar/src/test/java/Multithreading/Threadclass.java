package Multithreading;

public class Threadclass {
	
	public static void main(String[] args) {
		
		A obj= new A();
		B obj1= new B();
		obj.start();
		obj1.start();
		
	}
}	

class A extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Hi");
			try{Thread.sleep(500);}catch (Exception e){}
		}
	}
}

class B extends Thread{

public void run(){
	for(int i=1;i<=5;i++){
		System.out.println("Hello");
		try{Thread.sleep(500);}catch (Exception e){}
	}
}

}