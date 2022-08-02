import java.util.*;

public class Queue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the Queue");
		int size=sc.nextInt();
		int que[]=new int[size];
		int front=-1,rear=-1;
		while(true) {
			System.out.println("enter ur choice 1.enqueue 2.dequeue 3.display 4.exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1: if(rear==size-1) {
				System.out.println("Queue is full ni insertions");
			}
			else {
				System.out.println("enter the ele to insert");
				int key=sc.nextInt();
				rear++;
				que[rear] = key;
				front=0;
			}
			break;
			
			case 2: if((front==-1 && rear==-1) || (front>rear)) {
				System.out.println("Queue is empty no delete");
			}
			else {
				front = front +1;
			}
			break;
			
			case 3: if((front==-1 && rear==-1) || (front>rear)) {
				System.out.println("Queue is empty no delete");
			}
			else {
				for(int i=front;i<=rear;i++)
				   System.out.println(que[i]);
			}
			break;
			
			case 4: System.exit(0);
			}

		}

	}

}
