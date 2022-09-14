package techiedelight;

import java.util.HashSet;
import java.util.Set;

public class subarraywith0sum {

	public static void main(String[] args) {
		
		int a[]={4,-6,-3,-1,4,2,7};
		//int a[]={4,-6,3,1,4,2,7};
		if(subarray(a)){
			System.out.println("Sum Zero exists in sub array");
		}
		else{
			System.out.println("Sum Zero does not exists in sub array");
		}
		
	}
	
	public static boolean subarray(int []a){
		
		Set<Integer> subse= new HashSet<>();
		subse.add(0);
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
			if(subse.contains(sum)){
				return true;
			}
			subse.add(sum);
		}
		return false;
	}
	
}
