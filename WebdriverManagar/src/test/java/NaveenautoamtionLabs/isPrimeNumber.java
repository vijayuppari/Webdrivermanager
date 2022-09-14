package NaveenautoamtionLabs;

public class isPrimeNumber {
	
	public static boolean isPrime(int num){
		
		if(num<=1){
			return false;
		}
		
		for(int i=2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
	
	public static void getprimenumbers(int num){
		for(int i=2;i<num;i++){
			if(isPrime(i)){
				System.out.print(i + ",");
			}
		}
	}
	
	public static void main(String[] args) {
		
		/*System.out.println("Given number 2 is " + isPrime(2));
		System.out.println("Given number 3 is " + isPrime(3));
		System.out.println("Given number 4 is " + isPrime(4));
		System.out.println("Given number 10 is " + isPrime(10));
		System.out.println("Given number 11 is " + isPrime(11));*/
		
		getprimenumbers(50);
	}

}
