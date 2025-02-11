import java.util.Scanner;

class Point {
    int x, y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int m) {
        x = m; 
        y = m;
    }

    Point(int x, int y) {
        this.x = x; 
        this.y = y;
    }

    Point(Point P1) {
        x = P1.x;
        y = P1.y;
    }

    float find_Distance() {
        float distance = (float) Math.sqrt(x * x + y * y);
        return distance;
    }

    float find_Distance(int p, int q) {
        float distance = (float) Math.sqrt((x - p) * (x - p) + (y - q) * (y - q));
        return distance;
    }

    float find_Distance(Point P1) {
        float distance = (float) Math.sqrt((x - P1.x) * (x - P1.x) + (y - P1.y) * (y - P1.y));
        return distance;
    }

    boolean is_Equal(Point P1) {
        return x == P1.x && y == P1.y;
    }

    void show() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}


class Point_Demo {
    public static void main(String[] args) {
        System.out.println("Test using provided values");
        Point P1 = new Point(3, 4);
        Point P2 = new Point(P1);
        P1.show();
        P2.show();
        System.out.println("Distance of P1 from origin: " + P1.find_Distance());
        System.out.println("Distance of P1 from (6, 8): " + P1.find_Distance(6, 8));
        System.out.println("Distance between P1 and P2: " + P1.find_Distance(P2));
        System.out.println("P1 and P2 are equal: " + P1.is_Equal(P2));

        if (args.length >= 4) {
            System.out.println("\nTesting with command line arguments:");
            int x1 = Integer.parseInt(args[0]);
            int y1 = Integer.parseInt(args[1]);
            int x2 = Integer.parseInt(args[2]);
            int y2 = Integer.parseInt(args[3]);
            Point P3 = new Point(x1, y1);
            Point P4 = new Point(x2, y2);
            P3.show();
            P4.show();
            System.out.println("Distance of P3 from origin: " + P3.find_Distance());
            System.out.println("Distance of P3 from P4: " + P3.find_Distance(P4));
            System.out.println("P3 and P4 are equal: " + P3.is_Equal(P4));
        } else {
            System.out.println("Command-line arguments not provided.");
        }

        System.out.println("\nTesting with Scanner input:");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x and y for Point P5: ");
        int x5 = s.nextInt();
        int y5 = s.nextInt();
        System.out.print("Enter x and y for Point P6: ");
        int x6 = s.nextInt();
        int y6 = s.nextInt();
        Point P5 = new Point(x5, y5);
        Point P6 = new Point(x6, y6);
        P5.show();
        P6.show();
        System.out.println("Distance of P5 from origin: " + P5.find_Distance());
        System.out.println("Distance of P5 from P6: " + P5.find_Distance(P6));
        System.out.println("P5 and P6 are equal: " + P5.is_Equal(P6));
    }
}
