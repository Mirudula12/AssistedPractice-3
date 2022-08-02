import java.util.*;

public class Stack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the stack");
		int size=sc.nextInt();
		int stack[]=new int[size];
		int top=-1;
		while(true) {
			System.out.println("enter the choice 1.push 2.pop 3.display 4.exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1: if(top==size-1) {
				System.out.println("Stack is full no insertions");
			}
			else {
				System.out.println("Enter the value:");
				int key=sc.nextInt();
				top++;
				stack[top] =key;
			}
			break;
			
			case 2: if(top==-1) {
				System.out.println("Stack is empty no delete");
			}
			else {
				top=top-1;
			}
			break;
			
			case 3: if(top==-1) {
				System.out.println("No elements to display");
			}
			else {
				for(int i=top;i>=0;i--) {
					System.out.println(stack[i]);
				}
			}
			break;
			
			case 4: System.exit(0);
			break;
			}
		}

	}

}
