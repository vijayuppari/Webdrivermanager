package Algorthims;

public class sumofdigits {

	public static void main(String[] args) {
		// reverse the number
		reverse(123);
	}
	
	// Armstrong number
	public static void aormstrong(int num){
		
		int reminder, sum=0;
		while(num>0){
		reminder=num%10;
		sum=sum+reminder*reminder*reminder;
		num=num/10;
		}
		System.out.println(sum);
	}
	
	// Sum of digits number
		public static void sumofdigts(int num){
			
			int reminder, sum=0;
			while(num>0){
			reminder=num%10;
			sum=sum+reminder;
			num=num/10;
			}
			System.out.println(sum);
		}
		
		// reverse of number
				public static void reverse(int num){
					
					int reminder, sum=0;
					while(num>0){
					reminder=num%10;
					sum=sum*10+reminder;
					num=num/10;
					}
					System.out.println(sum);
				}
}
