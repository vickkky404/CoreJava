// OOPS Program 11: Multiple Inheritance using Interfaces
public class OOPS_11_MultipleInheritance {
    interface Flyable { void fly(); }
    interface Swimmable { void swim(); }
    static class Duck implements Flyable, Swimmable {
        @Override public void fly() { System.out.println("Duck flying"); }
        @Override public void swim() { System.out.println("Duck swimming"); }
    }
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
