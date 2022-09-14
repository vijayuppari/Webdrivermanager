package DataStructures;

// Stack implementation Using Array (static ; size is fixed)

public class StackwithArrayImple {
	int size;
	int arr[];
	int top;
	public StackwithArrayImple(int size) {
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
	}
	public void push(int element){
		
		if(!isFull()){
			top++;
			arr[top]=element;
			System.out.println("Pushed element in Stack is "+ element);
		}
		else{
			System.out.println("Stack is already Full");
		}
	}
	public int pop(){
		
		if(!isEmpty()){
			int returnedele=top;
			System.out.println("poped element is "+ arr[returnedele]); 
			return arr[returnedele];
		}
		else{
			System.out.println("Stack is Empty");
			return -1;
		}
	}	
	public boolean isEmpty(){
		return top==-1;
	}
	public boolean isFull(){
		return (size-1==top);
	}
	
	public int peek(){
		if(!isEmpty()){
			return arr[top];
		}
		else{
			System.out.println("Stack is Empty ");
			return -1;
		}
	}
	

	
	public static void main(String[] args) {
		
		StackwithArrayImple stack = new StackwithArrayImple(4);
		stack.pop();
		System.out.println("...........................");
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		System.out.println(".............................");
		System.out.println(stack.peek());
		System.out.println(".............................");
		stack.pop();
		stack.pop();
		System.out.println(".............................");
		System.out.println(stack.isEmpty());
		System.out.println(".............................");
		System.out.println(stack.isFull());
	}

}
