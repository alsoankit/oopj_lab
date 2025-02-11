package MyPack;

public class Number {
    int value;

    public Number(int value) {
        this.value = value;
    }

    public long find_factorial() {
        long fact = 1;
        for (int i = 1; i <= value; i++) {
            fact *= i;
        }
        return fact;
    }
}
