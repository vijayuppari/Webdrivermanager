package Naveen.Java8.concepts;

public class WebpageImple {
	
	public static void main(String[] args) {
		
		
		/*
		 * Webpage page= (String value) ->
		 * System.out.println("I am web page header "+value); page.header("Vijay Here");
		 * 
		 * Webpage page1= (value) -> System.out.println(value.length());
		 * page1.header("vijay");
		 * 
		 * Webpage page2= value -> System.out.println(value.toUpperCase());
		 * page2.header("vijay");
		 */
		
		/*
		 * Webpage p= (a,b)->(a+b); System.out.println(p.sum(200, 300));
		 * 
		 */
		
		
		/*
		 * Runnable r1= new Runnable() {
		 * 
		 * @Override public void run() { System.out.println("Thread 1 is Running"); } };
		 * 
		 * Thread t1= new Thread(r1); t1.start(); }
		 */
	
	Runnable r2= ()->System.out.println("Thread 2 is Running");
	
	Thread t2= new Thread(r2);
	t2.start();
}

}
