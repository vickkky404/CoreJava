// OOPS Program 12: Composition (HAS-A Relationship)
public class OOPS_12_Composition {
    static class Engine {
        public void start() { System.out.println("Engine started"); }
    }
    static class Car {
        private Engine engine = new Engine();
        public void drive() {
            engine.start();
            System.out.println("Car driving");
        }
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
