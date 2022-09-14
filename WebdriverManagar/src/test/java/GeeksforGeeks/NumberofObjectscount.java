package GeeksforGeeks;

public class NumberofObjectscount {
	
	
	
	static int numberofobject=0;
	
	{
		numberofobject++;
	}
	
	public NumberofObjectscount(){}
	public NumberofObjectscount(int n){}
	public NumberofObjectscount(String s){}
	
	public static void main(String[] args) {
		
		NumberofObjectscount obj1= new NumberofObjectscount();
		NumberofObjectscount obj2= new NumberofObjectscount(12);
		NumberofObjectscount obj3= new NumberofObjectscount("vijay");
		System.out.println("Number of objects " + NumberofObjectscount.numberofobject);
		
		
	}
	

}
