package Adaptorpattern;

import java.util.Arrays;
import java.util.Comparator;

import javax.management.RuntimeErrorException;

public class trycatch {
	
	
	/*public static void main(String[] args) {
		try{
		System.out.println("hello");
		throit();}
		catch(Exception e){
			System.out.println("caughtit");
		}
		finally {
			System.out.println("fially");
		}
		System.out.println("after");
		
	}
	
	static void throit(){
		System.out.println("throwit");
		throw new RuntimeErrorException(null);
	}*/
	
public static void main(String[] args) {
	
	/*access obj1= new access();
	access obj2= new access();
	obj1.x=0;
	obj1.y=0;
	obj1.call(1, 2);
	
	obj2.x=0;
	obj2.call(2, 3);
	
	System.out.println(obj1.x+ "*****" + obj2.y);*/
	
	/*try{
		System.out.println(some(args));
	}
	catch(Exception e){
		System.out.println("exec");
		some(args);
	}
}
	static int some(String[] args){
		return Integer.parseInt(args[0]);
	}*/
	
	/*String[] cities ={"banglore","Pune","SanFran","New York City"};
	mysort ms= new mysort();
	Arrays.sort(cities,ms);
	System.out.println(Arrays.binarySearch(cities, "New York City"));*/
	
	String s="abbaaacd";
	int num=0;
	for(int i=0;i<=s.length()-1;i++){
		for(int j=i+1;j>i;j++){
			//s.substring(i,s.length());
			char charAt = s.charAt(i);
			char charAt1 = s.charAt(j);
			if(charAt==charAt1){
				num++;
			}
			System.out.print(1+s.substring(i,s.length()));
		}
	}
	
}

/*static class mysort implements Comparator{

	public int compare(String a, String b) {
		
		return b.compareTo(a);
	}
	
	
	}*/

//abbaaacd
//a2b3a1c1d

}



/*class access{
	public int x;
	static int y;
	
	void call(int a, int b){
		x+=a;
		y+=b;
	}
}
	
	


*/