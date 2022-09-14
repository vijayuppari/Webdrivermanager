package Hackerrank;

public class jumpingonclouds {
	
	// 0 0 1 0 0 1 0 // ouput jumpes are: 1+1+1+1=4;
	// 0 0 0 0 1 0 // output jumps are : 1+1+1 =3;
	// 0 0 1 0 0 0 0 1 0 0 // output jumps : 1+1+1+1+1+1 =6
	
	
	public static void main(String[] args) {
		int a[]={0,0,1,0,0,1,0};
		int b[]={0,0,0,0,1};
		int c[]={0,0,1,0,0,0,0,1,0,0};
		System.out.println(numberofjumpsv3(a));
		System.out.println(numberofjumpsv3(b));
		System.out.println(numberofjumpsv3(c));
	}
	
	// Approach 1:
	public static int numberofjumpsv1(int a[]){
		
		int len=a.length;
		int count=-1;
		for(int i=0;i<len;){
			if(i+2<len && a[i+2]==0){
				i=i+2;
			}
			else
				i++;
			count++;
		}
		return count;
	}
	
	// Approach 2:
	public static int numberofjumpsv2(int a[]){
		
		int len=a.length;
		int count=-1;
		for(int i=0;i<len;){
			if(i+2<len && a[i+2]==0){
				i++;
			}
				i++;
			count++;	
		}
		return count;
	}
	
	public static int numberofjumpsv3(int a[]){
		
		int len=a.length;
		int count=-1;
		for(int i=0;i<=len-1;i++,count++){
			if(i+2<len && a[i+2]==0){
				i++;
			}
		}
		return count;
	
	}
}
