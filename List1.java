import java.util.Scanner;

public class LinkList {

	private Node head;
	private static class Node {
		
		private int data;
		private Node next;
		public Node(int data) {
			super();
			this.data=data;
			this.next=null;
		}
	}
	
	public void insert(int data) {
		Node newnode=new Node(data);
		if(head == null) {
			head = newnode;
		}
		else {
			Node currentnode = head;
			while(currentnode.next != null) {
				currentnode = currentnode.next;
			}
			currentnode.next=newnode;
		}
		
	}
	
	public boolean delete(int key) {
		boolean isFound=false;
		if(head==null) {
			System.out.println("List is empty");
		}
		if(head.data == key) {
			head=head.next;
			return true;
		}
		
		Node currentnode=head;
		Node previousnode =null;
		while(currentnode !=null) {
			if(currentnode.data == key) {
				isFound = true;
				break;
			}
			previousnode = currentnode;
			currentnode = currentnode.next;
		}
		if(currentnode == null) {
			return isFound;
		}
		currentnode = previousnode.next;
		previousnode.next = currentnode.next;
		currentnode.next = null;
		return isFound;
	}
	
	public void display() {
		Node currentnode = head;
		while(currentnode!= null) {
			System.out.print(currentnode.data+" ");
			currentnode = currentnode.next;
		}
	}
	
	public static void main(String[] args) {
		LinkList l = new LinkList();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		l.insert(60);
		
		System.out.println("LinkedList:");
		l.display();
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key :");
		int key = sc.nextInt();
		if (l.delete(key)) {
			System.out.println("After removing" );
			System.out.println("Linked List :" );
			l.display();
		} 
		else
			System.out.println("Not found in List");

	}

}
