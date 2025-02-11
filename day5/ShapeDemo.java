import java.util.Scanner;

class Shape {
    double dim1, dim2; 

    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    void findArea() {}
}

class Triangle extends Shape {
    Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    void findArea() {
        double area = 0.5*dim1*dim2;
        System.out.println("triangle area " + area);
    }
}

class Rectangle extends Shape {
    Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void findArea() {
        double area = dim1*dim2;
        System.out.println("rectangle area " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base and height ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        Shape s = new Triangle(base, height);
        s.findArea(); 
        System.out.println("enter length and width ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        s = new Rectangle(length, width);
        s.findArea(); 
    }
}
