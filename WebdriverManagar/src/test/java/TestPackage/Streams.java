package TestPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	public static void main(String[] args) {
	
		/*List<Integer> ls = new ArrayList<>(Arrays.asList(2,3,4,7,5,10,9,2,3,20));
		List<Integer> collect = ls.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		//
	
		long count = ls.stream().distinct().count();
		System.out.println(count);
		
		//
		List<String> lss = new ArrayList<>(Arrays.asList("vijay","Harish","nayan","Self"," "));
		List<Integer> collect2 =  lss.stream().map(String::length).collect(Collectors.toList());
		System.out.println(collect2);*/
		
		//
		/*List<String> lss = new ArrayList<>(Arrays.asList("vijay","Harish","nayan","Self"," "));
		List<String> collect3 =  lss.stream().filter(ele->!ele.isEmpty()).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect3);*/
		
		//
		
		List<String> lss = new ArrayList<>(Arrays.asList("vijay","Harish","nayan","Self"," "));
		List<String> collect4 =  lss.stream().map(ele->ele.substring(0,1).toUpperCase()+ele.substring(1).toLowerCase()).collect(Collectors.toList());
		System.out.println(collect4);
		
		// 
		String str="vijay kumar uppari";
		String[] split = str.split(" ");
		for(int i=0;i<split.length;i++){
		String firstchar = split[i].substring(0,1);
		String remainingchar = split[i].substring(1);
		String ss =firstchar.toUpperCase()+remainingchar.toLowerCase();
		System.out.println("sssss"+ss);
		}
		
		//printprime(40);
		
	/*	int arr[] = new int[]{2,4,10,60,100,300,200};
		Arrays.sort(arr);
		int i = arr[arr.length-1];
		System.out.println(i);
		System.out.println(arr[0]);*/
		
		/*int arr[] = new int[]{3,2,1,5,4};
		oddNumberpairs(arr);*/
		
		
	}
	
	public static void oddNumberpairs(int arr[]){
		
		int oddcount=0;
		int evencount=0;
		for(int i=0;i<=arr.length-1;i++){
			int x =arr[i];
			if(x%2==0){
				evencount++;
			}
			else{
				oddcount++;
			}
		}
		int odd =evencount*oddcount;
		System.out.println(odd);
		
		
	}
	
	
	public static boolean isPrime(int num){
		
		if(num<=1){
			return true;
		}
		for(int i=2;i<=num/2;i++){
		if(num%2==0){
			return false;
		}
		}
		return true;	
	}
	
	public static void printprime(int num){
		for(int i=2;i<num;i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}	
	}
	
	
	
	
	

}
