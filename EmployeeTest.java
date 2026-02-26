import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;
}

public class EmployeeTest {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Employee[] emp = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();

            System.out.println("\nEnter details of employee " + (i + 1));

            System.out.print("Enter employee number: ");
            emp[i].eNo = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter employee name: ");
            emp[i].eName = sc.nextLine();

            System.out.print("Enter employee salary: ");
            emp[i].eSalary = sc.nextDouble();
            sc.nextLine(); 
        }

        // Search employee (OUTSIDE the input loop)
        System.out.print("\nEnter employee number to search: ");
        int searchNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].eNo == searchNo) {
                System.out.println("\nEmployee Found!");
                System.out.println("Employee Number: " + emp[i].eNo);
                System.out.println("Employee Name: " + emp[i].eName);
                System.out.println("Employee Salary: " + emp[i].eSalary);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}
