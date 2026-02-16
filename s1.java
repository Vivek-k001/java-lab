class Student {
    // variables
    String name;
    int age;
    String location;

    // method
    void display() {
        System.out.println("Name of the student is " + name);
        System.out.println("Age of the student is " + age);
        System.out.println("Location of the student is " + location);
    }
}

class s1 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "vivek";
        s1.age = 20;
        s1.location = "mlp";

        s1.display();   
    }
}
