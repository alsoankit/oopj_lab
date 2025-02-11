interface Two_D {
  void find_area();
}

interface Three_D extends Two_D {
  void find_volume();
}

class CUBOID implements Two_D {
  double length, width, height;

  CUBOID(double length, double width, double height) {
      this.length = length;
      this.width = width;
      this.height = height;
  }

  public void find_area() {
      System.out.println("Cuboid Surface Area: " + (2 * (length * width + width * height + height * length)));
  }
}

class CUBE implements Three_D {
  double side;

  CUBE(double side) {
      this.side = side;
  }

  public void find_area() {
      System.out.println("Cube Surface Area: " + (6 * side * side));
  }

  public void find_volume() {
      System.out.println("Cube Volume: " + (side * side * side));
  }
}

public class ShapeDemo3 {
  public static void main(String[] args) {
      Two_D shape2D;
      Three_D shape3D;

      shape2D = new CUBOID(5, 3, 4);
      shape2D.find_area();

      shape3D = new CUBE(4);
      shape3D.find_area();
      shape3D.find_volume();
  }
}
