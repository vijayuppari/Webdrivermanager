package Algorthims;

import java.util.Arrays;

public class Arrayscompare {
	
	

	public static void main(String[] args) {

		/*String a[] = { "vijay", "nani", "java" };
		String b[] = { "vijay", "nani", "java" };

		boolean equals = Arrays.equals(a, b);
		if (equals == true) {
			System.out.println("Both Arrays are equal");
		} else
			System.out.println("Both arrays are not equal");

	}*/
		
		int result=1;
        int num=7;
        System.out.println(num);
            do {
            if(num%2==0){
                 result =num/2;
                 //System.out.println(result);
            }
            else{
               result= (num*3)+1;
               if(result%2==0){
                   System.out.println(result);
               }
               result++;
            }
        } while(result<1);
		 
	}
}
