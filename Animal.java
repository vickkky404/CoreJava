// Animal.java - Inheritance Example
public class Animal {
    protected String name;
    protected String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void eat() {
        System.out.println(name + " is eating...");
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

    public void display() {
        System.out.println("Name: " + name + ", Species: " + species);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String species, String breed) {
        super(name, species);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking: Woof! Woof!");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Canine", "Labrador");
        dog.display();
        dog.eat();
        dog.bark();
        dog.sleep();
    }
}
