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

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Rahul";
        s1.marks = 75;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Anu";
        s2.marks = 35;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Vikram";
        s3.marks = 50;

        s1.checkEligibility();
        s2.checkEligibility();
        s3.checkEligibility();
    }
}
