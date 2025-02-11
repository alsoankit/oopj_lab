class Vector {
  private int[] arr;

  public Vector(int[] arr) {
      this.arr = arr;
  }

  public Vector add(Vector v) {
      int[] result = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
          result[i] = this.arr[i] + v.arr[i];
      }
      return new Vector(result);
  }

  public void show() {
      System.out.print("[");
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]);
          if (i < arr.length - 1) {
              System.out.print(", ");
          }
      }
      System.out.println("]");
  }
}

public class Vector_Demo {
  public static void main(String[] args) {
      int[] array1 = {1, 2, 3}; 
      int[] array2 = {4, 5, 6}; 

      Vector vector1 = new Vector(array1);
      Vector vector2 = new Vector(array2);

      System.out.println("Vector 1:");
      vector1.show();
      System.out.println("Vector 2:");
      vector2.show();

      Vector resultVector = vector1.add(vector2);

      System.out.println("Resultant :");
      resultVector.show();
  }
}
