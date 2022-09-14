package Algorthims;

import java.util.HashSet;
import java.util.Set;

public class firstduplicateinarra {
	
	public static void main(String[] args) {
		
		int []arr={1,2,3,4,3,2,3,4,5};
		/*for(int i=0;i<=arr.length-1;i++){
			for(int j=i+1;j<=arr.length-1;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
					return;
				}
			}
		}	
	}*/
	
		Set<Integer> hset = new HashSet<>();
		for(Integer i:arr){
			if(hset.add(i)==false){
				System.out.println(i);
			}
		}	
	}

}
