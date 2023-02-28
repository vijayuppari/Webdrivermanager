package Algorthims;

import Hackerrank.staircase;

public class dowhile {
	
	public static void main1(String[] args) {
		
		int result=1;
		int num=8;
		System.out.println(num);
		/*do{
			if(num%2==0){
				result=num/2;
			}
			else{
				result= (num*3)+1;
			}
		}
		while(result>1);{
		System.out.println(result);
		};*/
		while(num>1){
			if(num%2==0){
				num=num/2;
			}
			else{
				num= (num*3)+1;
			}
			System.out.println(num);
		}
		
		
	}
	
	public static void permute(String str,int start,int end){
		if(start==end){
			System.out.println(str);
		}
		for(int i=start;i<=end;i++){
			str=swap(str, start, 1);
			permute(str, start+1, end);
			str=swap(str, start, 1);
		}
	}
	
	
	public static String swap(String str, int i,int j){
		
		char temp;
		char[] charArray = str.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
		
		
		
		
		
	}
	

}


//8: 4 ->1; 8,4,2,1
//7: 7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1