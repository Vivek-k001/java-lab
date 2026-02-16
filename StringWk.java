import java.util.Scanner;

public class StringWk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        System.out.println("Length of s1: " + s1.length());
        String s3 = s1.concat(" ").concat(s2);
        System.out.println("Concatenated String: " + s3);
        if (s1.length() > 1) {
            System.out.println("Character at index 1 in s1: " + s1.charAt(1));
        }
        char[] ch = new char[s1.length()];
        s1.getChars(0, s1.length(), ch, 0);
        System.out.print("getChars(): ");
        System.out.println(ch);
        System.out.println("compareTo(): " + s1.compareTo(s2));
        System.out.println("equals(\"Hello\"): " + s1.equals("Hello"));
        System.out.println("equalsIgnoreCase(\"hello\"): " + s1.equalsIgnoreCase("hello"));
        System.out.println("startsWith(\"He\"): " + s1.startsWith("He"));
        System.out.println("endsWith(\"lo\"): " + s1.endsWith("lo"));
        System.out.println("contains(\"ell\"): " + s1.contains("ell"));
        System.out.println("indexOf('l'): " + s1.indexOf('l'));
        System.out.println("toUpperCase(): " + s1.toUpperCase());
        System.out.println("toLowerCase(): " + s1.toLowerCase());
        System.out.println("replace('l','x'): " + s1.replace('l', 'x'));
        System.out.print("Enter an integer as string: ");
        String intStr = sc.nextLine();
        System.out.print("Enter a double as string: ");
        String doubleStr = sc.nextLine();
        Integer intVal = Integer.valueOf(intStr);
        Double doubleVal = Double.valueOf(doubleStr);
        System.out.println("Integer value: " + intVal);
        System.out.println("Double value: " + doubleVal);
    }
}

