// Constructor.java - Constructor Overloading
public class Constructor {
    private int id;
    private String name;
    private double salary;

    // Constructor 1: Default constructor
    public Constructor() {
        this.id = 0;
        this.name = "Unknown";
        this.salary = 0.0;
    }

    // Constructor 2: With id and name
    public Constructor(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0.0;
    }

    // Constructor 3: With all parameters
    public Constructor(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Constructor 4: Copy constructor
    public Constructor(Constructor emp) {
        this.id = emp.id;
        this.name = emp.name;
        this.salary = emp.salary;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        // Using different constructors
        Constructor emp1 = new Constructor();
        emp1.display();

        Constructor emp2 = new Constructor(101, "Raj");
        emp2.display();

        Constructor emp3 = new Constructor(102, "Priya", 50000);
        emp3.display();

        // Using copy constructor
        Constructor emp4 = new Constructor(emp3);
        emp4.display();
    }
}
