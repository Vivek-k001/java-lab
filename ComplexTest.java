import java.util.Scanner;

class Complex {

    int real;
    int imag;

    // Parameterized Constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    void add(Complex c1, Complex c2) {
        int sumReal = c1.real + c2.real;
        int sumImag = c1.imag + c2.imag;

        System.out.println("Sum = " + sumReal + " + " + sumImag + "i");
    }
}

public class ComplexTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter real and imaginary part of first complex number:");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        System.out.println("Enter real and imaginary part of second complex number:");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        Complex result = new Complex(0, 0);

        result.add(c1, c2);

        sc.close();
    }
}