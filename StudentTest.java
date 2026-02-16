import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    int marks;

    void checkEligibility() {
        if (marks >= 40)
            System.out.println(name + " is Eligible for Exam");
        else
            System.out.println(name + " is Not Eligible for Exam");
    }
}

public class StudentTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Student 1
        System.out.println("Enter details of Student 1:");
        s1.rollNo = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        s1.name = sc.nextLine();
        s1.marks = sc.nextInt();

        // Student 2
        System.out.println("Enter details of Student 2:");
        s2.rollNo = sc.nextInt();
        sc.nextLine();
        s2.name = sc.nextLine();
        s2.marks = sc.nextInt();

        // Student 3
        System.out.println("Enter details of Student 3:");
        s3.rollNo = sc.nextInt();
        sc.nextLine();
        s3.name = sc.nextLine();
        s3.marks = sc.nextInt();

        // Check eligibility
        s1.checkEligibility();
        s2.checkEligibility();
        s3.checkEligibility();

        sc.close();
    }
}