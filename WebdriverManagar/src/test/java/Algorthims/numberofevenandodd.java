package Algorthims;

public class numberofevenandodd {
	
	public static void main(String[] args) {
		
		numberofeven(123);
		
	}
	
	public static void numberofeven(int num){
		
		int even = 0,odd=0;
		while(num>0){
			int d =num%10;
			if(d%2==0){
				even++;
			}
			else
				odd++;
			num= num/10;	
		}
		System.out.println("Total Even Numbers are " +even);
		System.out.println("Total odd Numbers are " +odd);
	}

}
