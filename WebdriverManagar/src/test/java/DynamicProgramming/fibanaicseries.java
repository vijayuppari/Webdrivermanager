package DynamicProgramming;

public class fibanaicseries {
	
	
	// Using recusrive function
	static int n1=0,n2=1,n3=0;
	public static void fibrecusrsive(int n){
		
		if(n>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			fibrecusrsive(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		int count=10;
		fibrecusrsive(count);
		//System.out.println(fib(5));
		//printfib(5);
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
	
	public static void printfib(int count){
		
		int num1=0;int num2=1;int num3=0;
		if(count>0){
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
			printfib(count-1);
			
		}
		
		
	}
	
	
	
	
	
}
