package techiedelight;

import java.util.Arrays;

public class sortarrayo1 {
	
	// Input: int a[]={0,1,0,0,1,1,0,0,1};
	// Output: [1, 1, 1, 1, 1, 0, 0, 0, 0]
	
	public static void main(String[] args) {
		int a[]={0,1,0,0,1,1,0,0,1};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		sortzerosones(a);
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void sortzerosones(int a[]){
		
		int k=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				a[k++]=1;
			}
		}
		for(int i=k;i<a.length;i++){
			a[k++]=0;
		}
		
	}

}
