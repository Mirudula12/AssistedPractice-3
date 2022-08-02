import java.util.Scanner;

public class Mtarix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size:");
		int row = sc.nextInt();
		System.out.println("Enter column size:");
		int col = sc.nextInt();
		int m1[][] = new int[row][col];
		int m2[][] = new int[row][col];
		
		System.out.println("Enter 1st matrix elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter 2nd matrix elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				m2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nElements of array 1 are:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++ ) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Elements of array 2 are:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(m2[i][j] + " ");
			}
			System.out.println("\n");
		}

		int mul[][] = new int[row][col];
		
		System.out.println("Multiplication:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				mul[i][j] = 0;
				for(int k=0;k<row;k++) {
				   mul[i][j] = mul[i][j] + m1[i][k] * m2[k][j];
				}
				System.out.print(mul[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

}
