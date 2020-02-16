package DynamicProgramming;

public class fibanaicseries {
	
	
	// Using recusrive function
	public static int fibrecusrsive(int n){
		
		if(n<=1){
			return n;		
		}
		return fibrecusrsive(n-1)+fibrecusrsive(n-2);
	}
	
	public static void main(String[] args) {
		
		//System.out.println(fibrecusrsive(9));
		System.out.println(fib(9));
	}
	
	// Using normal for loop
	
	public static int fib(int n){
		
		int f[]= new int [n+2];
		int i;
		
		f[0]=0;
		f[1]=1;
		for(i=2;i<=n;i++){
		f[i]=f[i-1]+f[i-2];
	}
	return f[n];
	}
	
	
}
