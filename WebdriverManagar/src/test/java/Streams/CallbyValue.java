package Streams;

public class CallbyValue {
	
	// In Java there is no Call by reference, its only call by value
	
	/*int data=50;
	
	void change(int data){
		data=data+50;
	}
	
	public static void main(String[] args) {
		
		CallbyValue cv= new CallbyValue();
		System.out.println("Before Updating " + cv.data);
		cv.change(500);
		System.out.println("After Updating " + cv.data);
	}*/
	
	// Incase if we pass Object as Method Argument it will change
	
	int data=50;
	
	void change(CallbyValue callby){
		callby.data=callby.data+50;
	}
	
	public static void main(String[] args) {
		CallbyValue cv= new CallbyValue();
		System.out.println("Before Updating " + cv.data);
		cv.change(cv);
		System.out.println("After Updating " + cv.data);
	}

}
