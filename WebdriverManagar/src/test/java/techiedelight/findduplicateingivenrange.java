package techiedelight;

import java.util.HashSet;
import java.util.Set;

public class findduplicateingivenrange {
	
	public static void main(String[] args) {
		
		//int a[]={1,2,3,4,5};
		int a[]={5,1,2,5,6,3,4,5,5};
		System.out.println(getdupllicate(a));
	}
	
	public static int getdupllicate(int a[]){
		
		int count = 1;
		Set<Integer> duplcateset = new HashSet<>();
		for(int ele:a){
			if(duplcateset.contains(ele)){
				++count;
				System.out.println(count);
				return ele;
			}
			else
				duplcateset.add(ele);
			
		}
		return 0;
		
		
	}

}
