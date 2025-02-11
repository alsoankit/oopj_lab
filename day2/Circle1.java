import java.util.Scanner;;

class Circle1 {
    float radius;
    void setRadius(float r) {
        radius = r;
    }
    void findArea() {
        float area = 3.14f*radius*radius;
        System.out.println("area " + area);
    }
    void findPerimeter() {
        float perimeter = 2 *3.14f * radius;
        System.out.println("perimeter " + perimeter);
    }
}

class Circle1_Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Circle1 c = new Circle1();
        System.out.print("enter radius");
        float radius = s.nextFloat();
        c.setRadius(radius);
        c.findArea();
        c.findPerimeter();
    }
}

// struct area{
// a1
// a1.
