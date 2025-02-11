abstract class Shape {
    double dim1, dim2;

    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void findArea();
}

class Triangle extends Shape {
    Triangle(double base, double height) {
        super(base, height);
    }

    void findArea() {
        System.out.println("Triangle area: " + (0.5 * dim1 * dim2));
    }
}

class Rectangle extends Shape {
    Rectangle(double length, double width) {
        super(length, width);
    }

    void findArea() {
        System.out.println("Rectangle area: " + (dim1 * dim2));
    }
}

public class DMDExample {
    public static void main(String[] args) {
        Shape shape;

        shape = new Triangle(10, 5);
        shape.findArea();

        shape = new Rectangle(8, 4);
        shape.findArea();
    }
}
