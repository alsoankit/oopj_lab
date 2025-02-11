interface PersonalLoan {
  float find_Simple_Interest(float principal, int year);
}

class Bank1 implements PersonalLoan {
  static final float interest_rate = 10;

  public float find_Simple_Interest(float principal, int year) {
      return (principal * interest_rate * year) / 100;
  }
}

class Bank2 implements PersonalLoan {
  static final float interest_rate = 15;

  public float find_Simple_Interest(float principal, int year) {
      return (principal * interest_rate * year) / 100;
  }
}

public class LoanDemo {
  public static void main(String[] args) {
      PersonalLoan loan;

      loan = new Bank1();
      System.out.println("Bank1 Simple Interest: " + loan.find_Simple_Interest(10000, 2));

      loan = new Bank2();
      System.out.println("Bank2 Simple Interest: " + loan.find_Simple_Interest(10000, 2));
  }
}
