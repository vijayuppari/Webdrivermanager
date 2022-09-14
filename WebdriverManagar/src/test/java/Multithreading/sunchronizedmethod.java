package Multithreading;

public class sunchronizedmethod {
	
	int count;
	
	public synchronized void increment(){
		count++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		sunchronizedmethod c= new sunchronizedmethod();
		
		Thread t1= new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=5000;i++){
					c.increment();
				}
			}
		});
		
		Thread t2= new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=5000;i++){
					c.increment();
				}
			}
		});
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
		System.out.println("Counter is " + c.count);
	}

}
