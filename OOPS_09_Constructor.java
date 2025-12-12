// OOPS Program 9: Constructor Overloading
public class OOPS_09_Constructor {
    static class Person {
        String name;
        int age;
        Person() {
            this.name = "Unknown";
            this.age = 0;
        }
        Person(String name) {
            this.name = name;
            this.age = 0;
        }
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void display() { System.out.println(name + " - " + age); }
    }
    public static void main(String[] args) {
        new Person().display();
        new Person("Alice").display();
        new Person("Bob", 25).display();
    }
}
