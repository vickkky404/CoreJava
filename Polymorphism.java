// Polymorphism.java - Runtime Polymorphism with Method Overriding
public abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract void start();
    public abstract void stop();
}

class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(name + " Car is starting with engine sound...");
    }

    @Override
    public void stop() {
        System.out.println(name + " Car stopped.");
    }
}

class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(name + " Bike is starting with bike sound...");
    }

    @Override
    public void stop() {
        System.out.println(name + " Bike stopped.");
    }
}

class TestPolymorphism {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bike = new Bike("Hero");

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}
