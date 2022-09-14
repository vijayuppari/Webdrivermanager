package Lambda;

public class ThreadwithLamda {
	
	public static void main(String[] args) {
		
		new Thread(() -> System.out.println("Thread started with Lambda")
				).start();
		
		int i=20;
		int j=20;
		ThreadwithLamda obj= new ThreadwithLamda();
		String str="vijay";
		str.concat("Kumar");
		System.out.println(str);
		//System.out.println(obj.i);
	}

}
