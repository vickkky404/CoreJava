// Abstraction.java - Abstract Classes
abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void work();
    public abstract double getSalary();

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Teacher extends Person {
    private double salary;

    public Teacher(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println(name + " is teaching students.");
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

class Engineer extends Person {
    private double salary;

    public Engineer(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println(name + " is developing software.");
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

class TestAbstraction {
    public static void main(String[] args) {
        Person teacher = new Teacher("Mr. Singh", 40000);
        Person engineer = new Engineer("Ms. Sharma", 60000);

        teacher.display();
        teacher.work();
        System.out.println("Salary: " + teacher.getSalary());

        engineer.display();
        engineer.work();
        System.out.println("Salary: " + engineer.getSalary());
    }
}
