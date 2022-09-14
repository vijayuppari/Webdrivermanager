package Multithreading;

public class Threadpractice {
	
	public static void main(String[] args) {
		
		Threadpractice threadpractice = new Threadpractice();
		
		Thread1 thread1= new Thread1(threadpractice);
		Thread1 thread2= new Thread1(threadpractice);
		thread1.start();
		thread2.start();
	}
	
	
	
	
	synchronized void print(){
		for(int i=1;i<=100;i++){
			System.out.println(i);
		}
	}

}

class Thread1 extends Thread{
	
	Threadpractice threadpractice;
	Thread1(Threadpractice threadpractice){
		this.threadpractice=threadpractice;
	}
	
	public void run(){
		threadpractice.print();	
	}
	
}

class Thread2 extends Thread{
	Threadpractice threadpractice;
	Thread2(Threadpractice threadpractice){
		this.threadpractice=threadpractice;
	}
	
	public void run(){
		threadpractice.print();
	}
	
}
