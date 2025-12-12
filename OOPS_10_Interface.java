// OOPS Program 10: Interface Implementation
public class OOPS_10_Interface {
    interface Animal {
        void eat();
        void sleep();
    }
    static class Dog implements Animal {
        @Override public void eat() { System.out.println("Dog eats"); }
        @Override public void sleep() { System.out.println("Dog sleeps"); }
    }
    static class Cat implements Animal {
        @Override public void eat() { System.out.println("Cat eats"); }
        @Override public void sleep() { System.out.println("Cat sleeps"); }
    }
    public static void main(String[] args) {
        Animal d = new Dog();
        d.eat();
        d.sleep();
        Animal c = new Cat();
        c.eat();
        c.sleep();
    }
}
