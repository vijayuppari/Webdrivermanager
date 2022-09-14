package NaveenautoamtionLabs;

public class ReverseOfInteger {
	
	
	public static void main(String[] args) {
		
		ReverseOfInteger reverse= new ReverseOfInteger();
		//reverse.reverseofinteger(123);
		//reverse.sumofDigits(123);
		reverse.isPalidrom(122);
	}
	
	
	
	public int reverseofinteger(int num){
		
		int sum=0;
		while(num!=0){
			int rem =num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		return sum;
		
		
	}
	
	public void sumofDigits(int num){
		
		int sum=0;
		while(num!=0){
			int rem =num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
		
	}
	
	
	public void isPalidrom(int num){
		
		int reverseofinteger = reverseofinteger(122);
		
		String result =(reverseofinteger==num)? "Given integer is Palidrom": "Given integer is Not Palidrom";
		System.out.println(result);
		
	}
	
	
	

}
