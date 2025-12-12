// OOPS Program 7: Static and Instance Methods
public class OOPS_07_StaticMethods {
    static int count = 0;
    static class Counter {
        int instanceCount = 0;
        Counter() { count++; instanceCount++; }
        public static void getStaticCount() { System.out.println("Static Count: " + count); }
        public void getInstanceCount() { System.out.println("Instance: " + instanceCount); }
    }
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        Counter.getStaticCount();
    }
}
