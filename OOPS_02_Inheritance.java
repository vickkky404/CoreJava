// OOPS Program 2: Inheritance
public class OOPS_02_Inheritance {
    static class Animal {
        protected String name;
        public Animal(String name) { this.name = name; }
        public void sound() { System.out.println("Some sound"); }
    }
    
    static class Dog extends Animal {
        public Dog(String name) { super(name); }
        @Override
        public void sound() { System.out.println(name + " barks"); }
    }
    
    static class Cat extends Animal {
        public Cat(String name) { super(name); }
        @Override
        public void sound() { System.out.println(name + " meows"); }
    }
    
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        dog.sound();
        cat.sound();
    }
}
