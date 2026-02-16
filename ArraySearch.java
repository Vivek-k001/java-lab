import java.util.Scanner;
public class ArraySearch {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : " );

		int n = sc.nextInt();

		int[] a =new int [n];

		System.out.println("Enter array elements : ");
		for (int i = 0; i < n ; i++)
			a[i] = sc.nextInt();

		System.out.println("Enter element to search : ");
		int key = sc.nextInt();

		boolean found = false; 
		for (int i = 0 ; i < n ; i ++ ) {
			if (a[i] == key ) {
				System.out.println("Element found at position " + (i + 1));

				found = true;
				break;
			}}
		if(!found)
			System.out.println("Element not found ");
	}}
