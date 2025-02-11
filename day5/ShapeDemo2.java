interface Two_D {
  void findArea();
}

interface Three_D extends Two_D {
  void findVolume();
}

class Cuboid implements Two_D, Three_D {
  private double length, width, height;

  Cuboid(double length, double width, double height) {
      this.length = length;
      this.width = width;
      this.height = height;
  }

  @Override
  public void findArea() {
      double area = 2 * (length * width + width * height + height * length);
      System.out.println("Surface Area of Cuboid: " + area);
  }

  @Override
  public void findVolume() {
      double volume = length * width * height;
      System.out.println("Volume of Cuboid: " + volume);
  }
}

class Cube implements Two_D, Three_D {
  private double side;

  Cube(double side) {
      this.side = side;
  }

  @Override
  public void findArea() {
      double area = 6 * side * side;
      System.out.println("Surface Area of Cube: " + area);
  }

  @Override
  public void findVolume() {
      double volume = side * side * side;
      System.out.println("Volume of Cube: " + volume);
  }
}

public class ShapeDemo2 {
  public static void main(String[] args) {
      Three_D shape;

      shape = new Cuboid(4, 3, 2);
      shape.findArea();
      shape.findVolume();

      shape = new Cube(5);
      shape.findArea();
      shape.findVolume();
  }
}
