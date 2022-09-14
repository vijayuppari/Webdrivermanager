package Multithreading;

public class Runnble {
	
	public static void main(String[] args) {
		
		Runnable obj= new Hi();
		Runnable obj1= new Hello();
		
		Thread t1= new Thread(obj);
		Thread t2= new Thread(obj1);
		t1.start();
		t2.start();				
	}
	
}

class Hi implements Runnable{
	
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Hi");
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}

class Hello implements Runnable{
	
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Hello");
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}