interface AREA {
  void findArea();
}

class Triangle implements AREA {
  double base, height;

  Triangle(double base, double height) {
      this.base = base;
      this.height = height;
  }

  public void findArea() {
      System.out.println("Triangle area: " + (0.5 * base * height));
  }
}

class Rectangle implements AREA {
  double length, width;

  Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
  }

  public void findArea() {
      System.out.println("Rectangle area: " + (length * width));
  }
}

public class AreaDemo {
  public static void main(String[] args) {
      AREA shape;

      shape = new Triangle(10, 5);
      shape.findArea();

      shape = new Rectangle(8, 4);
      shape.findArea();
  }
}
