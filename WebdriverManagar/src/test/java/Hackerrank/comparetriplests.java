package Hackerrank;

public class comparetriplests {

	
	public static void main(String[] args) {
		int a[]={5,6,7,10};
		int b[]={2,8,9,5};
		comparetriplets(a, b);
		
	}
	
	public static void comparetriplets(int a[], int b[]){
		
		int ascore=0, bscore=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>b[i]){
				ascore++;
			}
			else
				bscore++;
		}
		System.out.println(ascore+ " " + bscore);
	}
}
