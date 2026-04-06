import java.util.Scanner;

// Base class
class Student {
    int rollNo;
    float marks;

    void getStudentData(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Academic Marks: ");
        marks = sc.nextFloat();
    }

    void displayStudentData() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Academic Marks: " + marks);
    }
}

// Interface (used instead of second base class)
interface Sports {
    float sportsScore = 0;

    void getSportsData(Scanner sc);
    void displaySportsData();
}

// Derived class
class Result extends Student implements Sports {
    float sportsScore;
    float total;

    public void getSportsData(Scanner sc) {
        System.out.print("Enter Sports Score: ");
        sportsScore = sc.nextFloat();
    }

    public void displaySportsData() {
        System.out.println("Sports Score: " + sportsScore);
    }

    void calculate() {
        total = marks + sportsScore;
    }

    void displayResult() {
        displayStudentData();
        displaySportsData();
        System.out.println("Total Score: " + total);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        r.getStudentData(sc);
        r.getSportsData(sc);
        r.calculate();

        System.out.println("\n--- Student Result ---");
        r.displayResult();
    }
}
