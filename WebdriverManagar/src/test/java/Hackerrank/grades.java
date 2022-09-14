package Hackerrank;

import java.util.Arrays;

public class grades {
	
	public static void main(String[] args) {
		int grades[]={73,67,38,33};
		int[] gradestudents1 = gradestudents(grades);
		Arrays.stream(gradestudents1).forEach(System.out::println);
		
	}
	
	
	public static int[] gradestudents(int grades[]){
		
		for(int i=0;i<grades.length;i++){
			if(grades[i]>=38){
				int remider =grades[i]%5;
				int lower_num =grades[i]-remider;
				int upp_num=lower_num+5;
				int difference =upp_num-grades[i];
				if(difference<3){
					grades[i]=upp_num;
				}		
			}		
		}
		return grades;
	}

}
