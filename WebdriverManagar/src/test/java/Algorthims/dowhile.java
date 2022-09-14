package Algorthims;

public class dowhile {
	
	public static void main(String[] args) {
		
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

}


//8: 4 ->1; 8,4,2,1
//7: 7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1