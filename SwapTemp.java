import java.util.Scanner;

class SwapTemp{ 
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a : ");
	int a = sc.nextInt();

	System.out.print("Enter b : ");
	int b = sc.nextInt();

	int temp =  a;
	a = b;
	b = temp;

System.out.println("After swap : " );
System.out.println("a = " +  a + " b = " + b);

}
}
