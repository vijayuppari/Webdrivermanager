package NaveenautoamtionLabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class RemoveduplicatesfromArraylist {
	
	public static void main(String[] args) {
		
		// Using Streams
		ArrayList<Integer> elements= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,2,1));
		List<Integer> unielements = elements.stream().distinct().collect(Collectors.toList());
		System.out.println(unielements);
		
		// Using hashSet
		
		LinkedHashSet<Integer> hset= new LinkedHashSet<>(elements);
		ArrayList<Integer> uniquelements= new ArrayList<>(hset);
		System.out.println(uniquelements);
		
		// Using TreeMap
		Object[] array = elements.toArray();
		TreeMap<Integer, Integer> tmap= new TreeMap<>();
		for(int i=0;i<array.length-1;i++){
			if(tmap.containsKey(array[i])){
				tmap.remove(array[i]);
			}
			tmap.put((Integer) array[i], i);
		}
		
		Set<Integer> keySet = tmap.keySet();
		keySet.forEach(System.out::println);
		
	}

}
