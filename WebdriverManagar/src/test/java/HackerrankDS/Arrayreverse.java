package HackerrankDS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Arrayreverse {
	
	public static void main(String[] args) {
		//int a[]={1,2,3,4};
		int a[]={10,11,12,13,14,15,16};
		/*int[] rev = reversearray(a);
		Arrays.stream(rev).map(ele->ele).forEach(System.out::println);*/
		/*for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]+ " ");
		}*/
		reversejava8();
		
		//arrayreverse(a,0,a.length);
	}
	
	
	/*public static void arrayreverse(int a[], int start, int end){
		
		IntStream.range(start, end).map(i->end-i+start).forEach(System.out::println);
		
	}*/
	
	public static int[] reversearray(int a[]){
		
		int len =a.length-1;
		for(int i=0;i<=len/2;i++){
			swap(a, i, len-i);
		}
		return a;
		
	}
	
	public static void swap(int a[], int start, int end){
		int temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		
	}
	
	public static void reversejava8(){
		
		Integer a[]= new Integer[]{10,11,12,13,14,15,16};
		Arrays.asList(a).stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		
				
	}
	
	

}
