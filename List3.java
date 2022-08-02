public class List3 { 
	Node head; 
	class Node 
	{ 
		int data; 
		Node prev; 
		Node next; 
	    Node(int d) 
	    { 
		data = d; 
	    } 
	}
	public void push(int new_data) 
	{ 
		Node newnode = new Node(new_data); 
		newnode.next = head; 
		newnode.prev = null; 
		if (head != null) 
			head.prev = newnode; 
		head = newnode;
	} 

	public void insert(Node previousnode, int new_data) 
	{ 
		if (previousnode == null) 
		{ 
			System.out.println("The given previous node cannot be NULL "); 
			return; 
		} 	
		Node newNode = new Node(new_data); 
		newNode.next = previousnode.next; 
		previousnode.next = newNode; 
		newNode.prev = previousnode; 
		if (newNode.next != null) 
			newNode.next.prev = newNode; 
	} 

	void append(int new_data) 
	{ 
			Node new_node = new Node(new_data); 
			Node last = head; 
			new_node.next = null;
			if (head == null) 
			{ 
				new_node.prev = null; 
				head = new_node; 
				return; 
			} 
			while (last.next != null) 
				last = last.next; 
			last.next = new_node; 
			new_node.prev = last; 
	}

	public void print(Node node) { 
			Node last = null; 
			System.out.println("Traversal in forward Direction"); 
			while (node != null) 
			{ 
				System.out.print(node.data + " "); 
				last = node; 
				node = node.next; 
				System.out.println(); 
				System.out.println("Reverse direction"); 
				while (last != null) 
				{ 
					System.out.print(last.data + " "); 
					last = last.prev; 
	} 
	}
	}

	public static void main(String[] args) {
			List3 list = new List3();
			list.append(6); 
			list.push(7);
			list.push(1); 
			list.append(4); 
			list.insert(list.head.next, 8); 
			System.out.println("Doubly Linked list: "); 
			list.print(list.head);
	} 
} 
