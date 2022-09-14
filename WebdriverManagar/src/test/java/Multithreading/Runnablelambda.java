package Multithreading;

public class Runnablelambda {

public static void main(String[] args) throws InterruptedException {
		
		Thread t1= new Thread(() ->{
			for(int i=1;i<=5;i++){
				System.out.println("Hi");
				try{Thread.sleep(500);}catch(Exception e){}}
			});
		Thread t2= new Thread(()->{
			for(int i=1;i<=5;i++){
				System.out.println("Hello");
				try{Thread.sleep(500);}catch(Exception e){}
			}
		});
		//System.out.println(t1.getName());
		//System.out.println(t2.getName());
		t1.start();
		System.out.println(t1.getPriority());
		System.out.println(t1.isAlive());
		
		t1.join();
		
		t2.start();	
		System.out.println(t2.getPriority());
		t2.join();
		System.out.println("Bye");
	}
}

