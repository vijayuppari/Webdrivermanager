
package Hackerrank;

public class staircase {
	
	public static void main(String[] args) {
		
		staris(6);
		
	}
	
	public static void staris(int num){
		
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			System.out.print("#");
		}
		System.out.println();
	}
}
