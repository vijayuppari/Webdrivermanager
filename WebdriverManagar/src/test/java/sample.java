import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class sample {
	
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{1,2,3,4,6,1,3,4,6,7,6,6,7,8,6};
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for(int i=0;i<=arr.length-1;i++){
			int ele = arr[i];
			if(hmap.containsKey(ele)){
				Integer integer = hmap.get(ele);
				integer++;
				hmap.put(ele, integer);
			}
			else{
				hmap.put(ele, 1);
			}
		}
		int maxcount = 0; int key=-1;
	for(Entry<Integer, Integer> entry: hmap.entrySet()){
		if(maxcount<entry.getValue()){
			 key =entry.getKey();
			maxcount= entry.getValue();

		}
	}
		System.out.println(maxcount);
		
	}

}
