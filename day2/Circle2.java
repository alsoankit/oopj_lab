import java.util.Scanner;

class Circle2 {
    float radius;
    Circle2(float r) {
        radius = r;
    }
    void findArea() {
        float area = 3.14f*radius*radius;
        System.out.println("area " + area);
    }
    void findPerimeter() {
        float perimeter = 2*3.14f*radius;
        System.out.println("perimeter " + perimeter);
    }
}

class Circle2_Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter radius");
        float radius = s.nextFloat();
        Circle2 c = new Circle2(radius);
        c.findArea();
        c.findPerimeter();
    }
}
