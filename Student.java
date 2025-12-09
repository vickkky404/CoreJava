// Student.java - Encapsulation Example
public class Student {
    private String name;
    private int rollNo;
    private double gpa;

    // Constructor
    public Student(String name, int rollNo, double gpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.gpa = gpa;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for rollNo
    public int getRollNo() {
        return rollNo;
    }

    // Getter for gpa
    public double getGpa() {
        return gpa;
    }

    // Setter for gpa
    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA");
        }
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", GPA: " + gpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Raj Kumar", 101, 3.8);
        s1.display();
        s1.setGpa(3.9);
        s1.display();
    }
}
