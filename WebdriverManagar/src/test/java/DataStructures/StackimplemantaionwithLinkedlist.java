package DataStructures;

public class StackimplemantaionwithLinkedlist {
	
	Node head;
	class Node{
		int value;
		Node next;
	}
	StackimplemantaionwithLinkedlist(){
		head=null;
	}
	public void push(int value){
		Node extrahead=head;
		head= new Node();
		head.value= value;
		head.next=extrahead;
	}
	public int pop(){
		
		if(head==null){
			System.out.println("Stack is Empty");
		}
		
		int value= head.value;
		head= head.next;
		return value;
	}
	
	public void printList(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.value + " ");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		
		StackimplemantaionwithLinkedlist lls= new StackimplemantaionwithLinkedlist();
		//lls.pop();
		lls.push(100);
		lls.push(200);
		lls.push(300);
		lls.push(400);
		
		lls.printList(lls.head);
		System.out.println("...........................");
		System.out.println("Element is removed from Stack "+ lls.pop());
		
		
		
	}
	
	
}
