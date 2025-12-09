// Nested.java - Nested Classes Example
public class Nested {
    private String outerData = "Outer Class Data";

    // Inner class
    public class InnerClass {
        private String innerData = "Inner Class Data";

        public void displayInnerData() {
            System.out.println("Inner Data: " + innerData);
            System.out.println("Access Outer: " + outerData);
        }
    }

    // Static nested class
    public static class StaticNestedClass {
        private String staticData = "Static Nested Class Data";

        public void displayStaticData() {
            System.out.println("Static Nested Data: " + staticData);
        }
    }

    public void displayOuterData() {
        System.out.println("Outer Data: " + outerData);
    }

    public static void main(String[] args) {
        // Accessing outer class
        Nested outer = new Nested();
        outer.displayOuterData();

        // Accessing inner class
        Nested.InnerClass inner = outer.new InnerClass();
        inner.displayInnerData();

        // Accessing static nested class
        Nested.StaticNestedClass staticNested = new Nested.StaticNestedClass();
        staticNested.displayStaticData();
    }
}
