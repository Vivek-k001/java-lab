import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("First char: " + str.charAt(0));

        if (str.length() >= 4) {
            System.out.println("Substring (0–4): " + str.substring(0, 4));
        }

        System.out.println("Contains 'a': " + str.contains("a"));
        System.out.println("Index of 'a': " + str.indexOf("a"));
        System.out.println("Last index of 'a': " + str.lastIndexOf("a"));
        System.out.println("Replace 'a' with 'x': " + str.replace('a', 'x'));
        System.out.println("Trimmed: " + str.trim());
        System.out.println("Starts with H: " + str.startsWith("H"));
        System.out.println("Ends with o: " + str.endsWith("o"));

        sc.close();
    }
}

