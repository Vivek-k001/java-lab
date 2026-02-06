public class StringManipulation {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        // length()
        System.out.println("Length of s1: " + s1.length());

        // concat()
        String s3 = s1.concat(" ").concat(s2);
        System.out.println("Concatenated String: " + s3);

        // charAt()
        System.out.println("Character at index 1 in s1: " + s1.charAt(1));

        // getChars()
        char[] ch = new char[5];
        s1.getChars(0, 5, ch, 0);
        System.out.print("getChars(): ");
        System.out.println(ch);

        // compareTo()
        System.out.println("compareTo(): " + s1.compareTo(s2));

        // equals()
        System.out.println("equals(): " + s1.equals("Hello"));

        // equalsIgnoreCase()
        System.out.println("equalsIgnoreCase(): " + s1.equalsIgnoreCase("hello"));

        // startsWith()
        System.out.println("startsWith(\"He\"): " + s1.startsWith("He"));

        // endsWith()
        System.out.println("endsWith(\"lo\"): " + s1.endsWith("lo"));

        // contains()
        System.out.println("contains(\"ell\"): " + s1.contains("ell"));

        // indexOf()
        System.out.println("indexOf('l'): " + s1.indexOf('l'));

        // toUpperCase()
        System.out.println("toUpperCase(): " + s1.toUpperCase());

        // toLowerCase()
        System.out.println("toLowerCase(): " + s1.toLowerCase());

        // replace()
        System.out.println("replace(): " + s1.replace('l', 'x'));

        // Type conversions
        String intStr = "100";
        String doubleStr = "45.67";

        Integer intVal = Integer.valueOf(intStr);
        Double doubleVal = Double.valueOf(doubleStr);

        System.out.println("Integer value: " + intVal);
        System.out.println("Double value: " + doubleVal);
    }
}