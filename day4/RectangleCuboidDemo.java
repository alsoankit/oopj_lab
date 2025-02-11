class Rectangle {
  float length;
  float width;
  Rectangle(float length, float width) {
      this.length = length;
      this.width = width;
  }
  float find_Area() {
      return length * width;
  }
}
class Cuboid extends Rectangle {
  float height;
  Cuboid(float length, float width, float height) {
      super(length, width);
      this.height = height;
  }
  float find_Volume() {
      return length * width * height;
  }
}
public class RectangleCuboidDemo {
  public static void main(String[] args) {
      Rectangle rectangle = new Rectangle(10.5f, 5.2f);
      System.out.println("length: " + rectangle.length);
      System.out.println("width: " + rectangle.width);
      System.out.println("area " + rectangle.find_Area());
      Cuboid cuboid = new Cuboid(10.5f, 5.2f, 8.3f);
      System.out.println("length: " + cuboid.length);
      System.out.println("width: " + cuboid.width);
      System.out.println("height: " + cuboid.height);
      System.out.println("volume " + cuboid.find_Volume());
  }
}
