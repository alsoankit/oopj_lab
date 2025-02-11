class NoTriangleFormException extends Exception {
  public NoTriangleFormException(String message) {
      super(message);
  }

  @Override
  public String toString() {
      return "NoTriangleFormException: " + getMessage();
  }
}

class Triangle {
  double a, b, c;

  public Triangle(double a, double b, double c) throws NoTriangleFormException {
      if (a + b <= c || b + c <= a || c + a <= b) {
          throw new NoTriangleFormException("not a valid triangle");
      }
      this.a = a;
      this.b = b;
      this.c = c;
  }

  public double find_area() {
      double s = (a+ b+c)/2;
      return Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }

  public double find_perimeter() {
      return a+b+c;
  }
}

public class Demo2 {
  public static void main(String[] x) {
      try {
          Triangle t1 = new Triangle(3, 4, 5);
          System.out.println("triangle area " + t1.find_area());
          System.out.println("triangle perimeter " + t1.find_perimeter());

          Triangle t2 = new Triangle(1, 2, 8);
      } catch (NoTriangleFormException e) {
          System.out.println(e);
      }
  }
}
