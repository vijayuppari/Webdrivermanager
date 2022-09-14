package NaveenautoamtionLabs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateEmelemtsinArray {
	
	public static void main(String[] args) {
		
	Integer arr[]= new Integer[]{1,2,3,4,3,5,1,3,5};
	//findduplicates(arr);
	//findduplicateshashset(arr);	
	//finddeuplicateshashmap(arr);
	printdup(arr);
	}
	
	
	// Approach 1: Using For Loops
	public static void findduplicates(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j])
					System.out.print(arr[i]);
			}
		}	
	}
	
	// Approach 2: Using hashset
	public static void findduplicateshashset(int arr[]){
		
		HashSet<Object> hset= new HashSet<>();
		for(Integer element:arr){
			if(hset.add(element)==false){
				System.out.print("Duplicate Elements are... " + element);
			}
		}
	}
	
	//Approach 3: Using HashMap
	public static void finddeuplicateshashmap(int arr[]){
		
		HashMap<Integer, Integer> hmap= new  HashMap<>();
		for(Integer element:arr){
			 Integer count = hmap.get(element);
			if(count==null)
				hmap.put(element, 1);
			else
				hmap.put(element, ++count);
		}
		
			Set<Integer> keySet = hmap.keySet();
			for(Integer k:keySet){
				if(hmap.get(k)>1){
					System.out.println("Element " + k + " is repated" );
				}
			}
	}
	
	//Approach 4: Using Streams
	public static void printdup(Integer arr[]){
		Set<Integer> hset = new HashSet<Integer>();
		Arrays.asList(arr).stream().filter(ele-> !hset.add(ele)).collect(Collectors.toSet()).forEach(System.out::println);
		
	}
	

}
