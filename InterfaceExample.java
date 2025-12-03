// Interface
interface Animal {
    void eat();
    void sleep();
    void sound();
}

// Implementation
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
    
    public void sound() {
        System.out.println("Dog barks: Woof!");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat is eating");
    }
    
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
    
    public void sound() {
        System.out.println("Cat meows: Meow!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        dog.eat();
        dog.sound();
        dog.sleep();
        
        System.out.println();
        
        cat.eat();
        cat.sound();
        cat.sleep();
    }
}
