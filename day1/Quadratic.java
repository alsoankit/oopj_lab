import java.util.Scanner;

class Quadratic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        float a = s.nextFloat();

        System.out.print("Enter coefficient b: ");
        float b = s.nextFloat();

        System.out.print("Enter coefficient c: ");
        float c = s.nextFloat();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Real and distinct roots: " + root1 + ", " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Real and equal roots: " + root);
        } else {
            System.out.println("Imaginary roots");
        }
    }
}
