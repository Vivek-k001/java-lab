import java.util.Scanner;

class Publisher
{
    String pname;
}

class Book extends Publisher
{
    String bname;
    double price;
}

class Literature extends Book
{
    void read()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Publisher Name: ");
        pname = sc.nextLine();

        System.out.print("Enter Book Name: ");
        bname = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void display()
    {
        System.out.println("\nCategory: Literature");
        System.out.println("Publisher: " + pname);
        System.out.println("Book Name: " + bname);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book
{
    void read()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Publisher Name: ");
        pname = sc.nextLine();

        System.out.print("Enter Book Name: ");
        bname = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void display()
    {
        System.out.println("\nCategory: Fiction");
        System.out.println("Publisher: " + pname);
        System.out.println("Book Name: " + bname);
        System.out.println("Price: " + price);
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Literature Book");
        System.out.println("2. Fiction Book");
        System.out.print("Enter Choice: ");

        int ch = sc.nextInt();
        sc.nextLine();

        if(ch == 1)
        {
            Literature l = new Literature();
            l.read();
            l.display();
        }
        else if(ch == 2)
        {
            Fiction f = new Fiction();
            f.read();
            f.display();
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
}