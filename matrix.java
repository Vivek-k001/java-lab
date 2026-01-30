import java.util.Scanner;

public class matrix {
	public static void main(String args[]) {

		int row , column;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter row : ");
		row = sc.nextInt();

		System.out.println("enter the column : ");
		column = sc.nextInt();

		int[][] a = new int[row][column];

		System.out.println("Enter Matrix elements : ");
		for(int i = 0; i < row; i++){
			for(int j = 0;j < column; j++){
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("The matrix is : ");
		for(int i= 0; i <row;i++){
			for(int j = 0; j < column; j++){
				System.out.println(a[i][j] + "");
			}
		}
	}
}
