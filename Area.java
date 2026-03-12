import java.util.Scanner;

class Area {

    double area(double r){
        return 3.14 * r * r;
    }

    int area(int l, int b){
        return l * b;
    }

    double area(double b, double h){
        return 0.5 * b * h;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Area a = new Area();

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int b = sc.nextInt();

        System.out.print("Enter base of triangle: ");
        double tb = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double h = sc.nextDouble();

        System.out.println("Circle area: " + a.area(r));
        System.out.println("Rectangle area: " + a.area(l, b));
        System.out.println("Triangle area: " + a.area(tb, h));

        sc.close();
    }
}
