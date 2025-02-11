class NegativeMoneyException extends Exception {
  NegativeMoneyException() {
      super("rupee and paise are not positive!");
  }
}

class Money {
  int rupee;
  int paise;

  Money(int rupee, int paise) throws NegativeMoneyException {
      if (rupee < 0 || paise < 0) {
          throw new NegativeMoneyException();
      }
      this.rupee = rupee;
      this.paise = paise;

      if (this.paise >= 100) {
        this.rupee += this.paise / 100;
        this.paise = this.paise % 100;
    }
  }

  Money add(Money other) throws NegativeMoneyException {
      return new Money(this.rupee + other.rupee, this.paise + other.paise);
  }

  @Override
  public String toString() {
      return "Rs." + rupee + "." + paise + "paise";
  }
}

public class MoneyDemo {
  public static void main(String[] args) {
      try {
          Money m1 = new Money(10, 50);
          Money m2 = new Money(5, 75);
          Money m3 = m1.add(m2);
          System.out.println("money 1 " + m1);
          System.out.println("money 2 " + m2);
          System.out.println("total " + m3);

          Money m4 = new Money(-5, 30);
      } catch (NegativeMoneyException e) {
          System.out.println("exception: " + e.getMessage());
      }
  }
}
