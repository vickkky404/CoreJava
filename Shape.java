// Shape.java - Interface Implementation
public interface Shape {
    double getArea();
    double getPerimeter();
    void display();
}

class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void display() {
        System.out.println("Rectangle: L=" + length + ", W=" + width);
        System.out.println("Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle: R=" + radius);
        System.out.println("Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}

class TestShape {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        Shape circle = new Circle(7);
        rect.display();
        circle.display();
    }
}
