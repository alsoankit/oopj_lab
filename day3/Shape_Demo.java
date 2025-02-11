import java.util.Scanner;

class Shape {
    float findArea(float radius) {
        return 3.14f * radius * radius;
    }
    float findArea(float length, float breadth) {
        return length * breadth;
    }
    float findArea(float side1, float side2, float side3) {
        float s = (side1 + side2 + side3)/2;
        float area = (float)Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        return area;
    }
}

class Shape_Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Shape geometry = new Shape();
        System.out.print(" enter radius ");
        float radius = s.nextFloat();
        System.out.println("circle area : " + geometry.findArea(radius));
        System.out.print(" enter length ");
        float length = s.nextFloat();
        System.out.print(" enter breadth ");
        float breadth = s.nextFloat();
        System.out.println("rectangle area : " + geometry.findArea(length, breadth));
        System.out.print(" enter side1 ");
        float side1 = s.nextFloat();
        System.out.print(" enter side2 ");
        float side2 = s.nextFloat();
        System.out.print(" enter side3 ");
        float side3 = s.nextFloat();
        System.out.println("triangle area : " + geometry.findArea(side1, side2, side3));



    }}