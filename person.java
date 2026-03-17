import java.util.Scanner;

class Person
{
    String name, gender, address;
    int age;

    Person(String n, String g, String a, int ag)
    {
        name = n;
        gender = g;
        address = a;
        age = ag;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

"Person.java" [noeol] 125L, 3150C                             1,1           Top

