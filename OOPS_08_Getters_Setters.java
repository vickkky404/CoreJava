// OOPS Program 8: Getters and Setters
public class OOPS_08_Getters_Setters {
    static class Student {
        private String name;
        private int age;
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { if(age > 0) this.age = age; }
        public void display() { System.out.println("Name: " + name + ", Age: " + age); }
    }
    public static void main(String[] args) {
        Student s = new Student("John", 20);
        s.display();
        s.setName("Jane");
        s.setAge(22);
        s.display();
    }
}
