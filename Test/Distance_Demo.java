class Distance {
  int km;
  int meter;

  Distance(int km, int meter) {
      this.km = km;
      this.meter = meter;
  }

  Distance add(Distance d2) {
      Distance d3 = new Distance(0, 0);
      d3.km = this.km + d2.km;
      d3.meter = this.meter + d2.meter;
      return d3;
  }

  Distance add(int km) {
      Distance d3 = new Distance(0, 0);
      d3.km = this.km + km;
      d3.meter = this.meter;
      return d3;
  }

  Distance add(int km, int meter) {
      Distance d3 = new Distance(0, 0);
      d3.km = this.km + km;
      d3.meter = this.meter + meter;
      return d3;
  }

  void show() {
      System.out.println(km + "Km." + meter + "meter");
  }
}

public class Distance_Demo {
  public static void main(String[] args) {
      Distance d1 = new Distance(5, 750);
      Distance d2 = new Distance(3, 300);

      Distance d3 = d1.add(d2);
      d3.show();
      Distance d4 = d1.add(2);
      d4.show();
      Distance d5 = d1.add(1, 250);
      d5.show();
  }
}
