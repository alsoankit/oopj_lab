class SavingsAccount {
  String name;
  int acc_no;
  float balance;
  static float annualInterestRate;
  SavingsAccount(String name, int acc_no, float balance) {
    this.name = name;
    this.acc_no = acc_no;
    this.balance = balance;
}
float calculateBalance(int years) {
    float interest = balance * (annualInterestRate / 100) * years;
    return balance + interest;
}
static void modifyInterestRate(float newRate) {
  annualInterestRate = newRate;
}
}

public class SavingsAccount_Demo {
  public static void main(String[] args) {
      SavingsAccount.modifyInterestRate(4f);
      SavingsAccount s1 = new SavingsAccount("Ankit", 409808250, 10000f);
      SavingsAccount s2 = new SavingsAccount("Aarthak", 159008998, 20000f);
      System.out.println("S1: " + s1.calculateBalance(3));
      System.out.println("S2: " + s2.calculateBalance(5));
      SavingsAccount.modifyInterestRate(5f);
      System.out.println("S1: " + s1.calculateBalance(1));
      System.out.println("S2: " + s2.calculateBalance(1));
    }
  }