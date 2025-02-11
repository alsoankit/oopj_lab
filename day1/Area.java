import java.util.Scanner;

class Area {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Circle radius: ");
        float radius = s.nextFloat();
        double area = 3.14 * radius * radius;

        System.out.println("Area of Circle " + area);

    }
}
