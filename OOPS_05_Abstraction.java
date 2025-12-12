// OOPS Program 5: Abstraction
public class OOPS_05_Abstraction {
    abstract static class Vehicle {
        abstract void start();
        abstract void stop();
        public void info() { System.out.println("This is a vehicle"); }
    }
    static class Car extends Vehicle {
        @Override void start() { System.out.println("Car started"); }
        @Override void stop() { System.out.println("Car stopped"); }
    }
    static class Bike extends Vehicle {
        @Override void start() { System.out.println("Bike started"); }
        @Override void stop() { System.out.println("Bike stopped"); }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
    }
}
