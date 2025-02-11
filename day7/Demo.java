import Geometry.Circle;
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        System.out.print("enter radius");
        double r = sc.nextDouble();
        c.setRadius(r);

        System.out.println("radius: " + c.getRadius());
        System.out.println("area: " + c.getArea());
        System.out.println("perimeter: " + c.getPerimeter());

    }
}
