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

        Teacher t[] = new Teacher[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("\nEnter details of Teacher "+(i+1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Emp ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Company: ");
            String comp = sc.nextLine();

            System.out.print("Qualification: ");
            String qual = sc.nextLine();

            System.out.print("Salary: ");
            double sal = sc.nextDouble();

            System.out.print("Teacher ID: ");
            int tid = sc.nextInt();
            sc.nextLine();

            System.out.print("Subject: ");
            String sub = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            t[i] = new Teacher(name,gender,address,age,
                               id,comp,qual,sal,
                               tid,sub,dept);
        }

        System.out.println("\n--- Teacher Details ---");

        for(int i=0;i<n;i++)
        {
            t[i].display();
        }
    }
}

class Employee extends Person
{
    int empid;
    String company, qualification;
    double salary;

    Employee(String n, String g, String a, int ag,
             int id, String c, String q, double s)
    {
        super(n,g,a,ag);
        empid = id;
        company = c;
        qualification = q;
        salary = s;
    }
}

class Teacher extends Employee
{
    String subject, department;
    int teacherid;

    Teacher(String n, String g, String a, int ag,
            int id, String c, String q, double s,
            int tid, String sub, String dept)
    {
        super(n,g,a,ag,id,c,q,s);
        teacherid = tid;
        subject = sub;
        department = dept;
    }

    void display()
    {
        System.out.println("\nName: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Emp ID: " + empid);
        System.out.println("Company: " + company);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Teacher ID: " + teacherid);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}