package Hackerrank;

public class Knagaroo {
	
	
	/*velocity=distance/time
	In our case velocity=distance/Jump
	d=v*j
	x1+v1j=x2+v2j
	v1j-v2j=x2-x1
	j(v1-v2)=x2-x1
	j=x2-x1/v1-v2
	
	if(x2-x1/v1-v2) remider is zero then return value is integer then YES else No*/
	
	
	
	public static void main(String[] args) {
	
		System.out.println(kangaroo(0,3,4,2));
		System.out.println(kangaroo(0,3,4,6));
	}
	
	public static String kangaroo(int x1,int v1,int x2,int v2){
		
		if(v1>v2){
			int reminder =(x2-x1)%(v1-v2);
			if(reminder==0){
				return "YES";
			}
			else
				return "NO";
		}
		return "NO";
	}
}
