package Algorthims;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class highestoccuranceofintegerinArray {
	
	public static void main(String[] args) {
		
	
	int[] array = new int[] { 1, 2, 4, 1, 3, 4, 2, 2, 1, 5, 3, 5,2,2 };
	
	// Approach 1 
	Long max = Arrays.stream(array).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).values()
	                .stream().max(Comparator.comparing(Function.identity())).orElse(0L);
	System.out.println(max);
	
	//Approach 2
	
	Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
	for(int i=0;i<=array.length;i++){
		int key = array[i];
		if(hmap.containsKey(key)){
			int freq =hmap.get(key);
			freq++;
			hmap.put(key, freq);
		}
		else{
			hmap.put(key, 1);
		}
	}
	
	int res=-1; int maxcount=0;
	for(Entry<Integer, Integer> val : hmap.entrySet()){
		if(maxcount<val.getValue()){
			res=val.getKey();
			maxcount= val.getValue();
		}
	}

	}
}
