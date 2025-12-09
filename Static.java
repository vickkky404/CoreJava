// Static.java - Static Members Example
public class Static {
    private static int count = 0;
    private int id;
    private String name;

    public Static(String name) {
        count++;
        this.id = count;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void showTotal() {
        System.out.println("Total objects created: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Initial count: " + Static.getCount());

        Static obj1 = new Static("Ravi");
        obj1.display();
        System.out.println("Count after obj1: " + Static.getCount());

        Static obj2 = new Static("Anjali");
        obj2.display();
        System.out.println("Count after obj2: " + Static.getCount());

        Static obj3 = new Static("Vikram");
        obj3.display();

        Static.showTotal();
    }
}
