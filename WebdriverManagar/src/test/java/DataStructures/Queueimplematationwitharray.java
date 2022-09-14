package DataStructures;

// FIFO
// Add element to Rear
// Remove element from Front
// enqueue for push Dequeue is for pop
public class Queueimplematationwitharray {
	
	int capacity;
	int queuearray[];
	int front;
	int rear;
	int currentsize;
	
	Queueimplematationwitharray(int sizeofQueue){
		this.capacity=sizeofQueue;
		front=0;
		rear=-1;
		queuearray= new int[this.capacity];
	}
	
	public void enQueue(int data){
		if(isFull()){
			System.out.println("Queue is Already full, Can not insert the data");
		}
		else{
			rear++;
			if(rear==capacity-1){
				rear=0;
			}
			queuearray[rear]=data;
			currentsize++;
			System.out.println(data + " added to the Queue");
		}
	}
	
	
	public void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty and can not delete elements");
		}
		else{
			front++;
			if(front==capacity-1){
				System.out.println(queuearray[front-1] + " removed fro Queue");
				front=0;
			}else{
				System.out.println(queuearray[front-1] + " removed from Queue");
			}
			currentsize--;
		}
	}
	
	
	public boolean isFull(){
		if(currentsize==capacity){
			return true;
		}
		return false;
	}
	
	
	public boolean isEmpty(){
		if(currentsize==0){
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Queueimplematationwitharray queue =new Queueimplematationwitharray(10);
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		
		queue.dequeue();
		queue.enQueue(40);
		queue.enQueue(50);
		queue.dequeue();
		queue.dequeue();
		
	}
	
	
	

}
