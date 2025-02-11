class Coordinate {
  double x, y;

  Coordinate(double x, double y) {
      this.x = x;
      this.y = y;
  }

  void findDistance() {}
}

class TwoD extends Coordinate {
  TwoD(double x, double y) {
      super(x, y);
  }

  @Override
  void findDistance() {
      double distance = Math.sqrt(x*x + y*y);
      System.out.println("distance from origin 2D " + distance);
  }
}

class ThreeD extends Coordinate {
  double z;

  ThreeD(double x, double y, double z) {
      super(x, y);
      this.z = z;
  }

  @Override
  void findDistance() {
      double distance = Math.sqrt(x*x + y*y + z*z);
      System.out.println("distance from origin in 3D: " + distance);
  }
}

public class Demo {
  public static void main(String[] x) {
      Coordinate c;

      c = new TwoD(3, 4);
      c.findDistance();

      c = new ThreeD(3, 4, 5);
      c.findDistance();
  }
}
