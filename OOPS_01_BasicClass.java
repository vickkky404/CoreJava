// OOPS Program 1: Basic Class and Constructor
// Demonstrate class creation with constructor and methods

public class OOPS_01_BasicClass {
    // Attributes
    private String name;
    private int age;
    private String email;

    // Constructor
    public OOPS_01_BasicClass(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Methods
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }

    public void increaseAge() {
        age++;
        System.out.println(name + " is now " + age + " years old");
    }

    public static void main(String[] args) {
        OOPS_01_BasicClass student = new OOPS_01_BasicClass("Raj", 20, "raj@example.com");
        student.displayInfo();
        student.increaseAge();
    }
}
