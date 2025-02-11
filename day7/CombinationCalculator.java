import MyPack.Number;
import java.util.Scanner;

class CombinationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        if (r > n) {
            System.out.println("r should be less than or equal to n.");
            return;
        }

        Number numN = new Number(n);
        Number numR = new Number(r);
        Number numNR = new Number(n - r);

        long factN = numN.find_factorial();
        long factR = numR.find_factorial();
        long factNR = numNR.find_factorial();

        long nCr = factN / (factR * factNR);
        System.out.println("nCr (" + n + "C" + r + ") = " + nCr);

    }
}
