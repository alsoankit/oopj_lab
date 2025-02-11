class NegativeAmountException extends Exception {
  public NegativeAmountException() {
      super("Negative amount.");
  }

  @Override
  public String toString() {
      return "NegativeAmountException: amount negative.";
  }
}

class MinimumBalanceException extends Exception {
  public MinimumBalanceException() {
      super("not having minimum balance");
  }

  @Override
  public String toString() {
      return "MinimumBalanceException: balance cannot fall below the minimum limit.";
  }
}

class Account {
  String name;
  int accno;
  float balance;

  public Account(String name, int accno, float balance) throws NegativeAmountException, MinimumBalanceException {
      if (balance < 0) {
          throw new NegativeAmountException();
      } else if (balance < 2000.0f) {
          throw new MinimumBalanceException();
      } else {
          this.name = name;
          this.accno = accno;
          this.balance = balance;
      }
  }

  public void withdraw(float cash) throws NegativeAmountException, MinimumBalanceException {
      if (cash < 0) {
          throw new NegativeAmountException();
      } else if ((balance - cash) < 2000.0f) {
          throw new MinimumBalanceException();
      } else {
          balance -= cash;
          System.out.println("withdrawal successful. current balance: " + balance);
      }
  }

  public void deposit(float cash) throws NegativeAmountException {
      if (cash < 0) {
          throw new NegativeAmountException();
      } else {
          balance += cash;
          System.out.println("deposit successful. current balance: " + balance);
      }
  }
}

public class Demo {
  public static void main(String[] x) {
      try {
          Account account = new Account("Ankit", 23051409, 3000.0f);
          account.deposit(1000.0f); 
          account.withdraw(1500.0f); 
          account.withdraw(2500.0f); 
      } catch (NegativeAmountException e) {
          System.out.println(e);
      } catch (MinimumBalanceException e) {
          System.out.println(e);
      }
  }
}
