public class List2 {  
 
	public class Node{  
		int data;  
		Node next;  
		public Node(int data) {  
			this.data = data;  
		}  
	}  
	
	public Node head = null;  
	public Node tail = null;  

	public void add(int data){  

		Node newNode = new Node(data);  
  
		if(head == null) {  
  
			head = newNode;  
			tail = newNode;  
			newNode.next = head;  
		}  
		else {  
 
			tail.next = newNode;  
			tail = newNode;    
			tail.next = head;  
		}  
}  
 
public void sort() {  
 
	Node current = head, index = null;  
	int temp;  
	if(head == null) {  
		System.out.println("List is empty");  
	}  
	else {  
		do{  
  
			index = current.next;  
			while(index != head) {  
  
				if(current.data > index.data) {  
					temp =current.data;  
					current.data= index.data;  
					index.data = temp;  
				}  
				index= index.next;  
			}  
			current =current.next;  
		}while(current.next != head);   
	}  
}  
  
public void display() {  
	Node current = head;  
	if(head == null) {  
		System.out.println("List is empty");  
	}  
	else {  
		do{  
 
			System.out.print(" "+ current.data);  
			current = current.next;  
		}while(current != head);  
		System.out.println();  
	}  
} 

public static void main(String[] args) {  
	List2 list = new List2();  

	list.add(45);  
	list.add(20);  
	list.add(12);  
	list.add(1);  
	list.add(89);  
 
	System.out.println("Circular linked list: ");  
	list.display();  
  
	list.sort();  

	System.out.println("Sorted list: ");  
	list.display();  
	}  
}  