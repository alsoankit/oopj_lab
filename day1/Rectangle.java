import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter length: ");
        float length = s.nextFloat();

        System.out.print("Enter breadth: ");
        float breadth = s.nextFloat();

        double area = length * breadth;
        float perimeter = 2 * (length + breadth);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
