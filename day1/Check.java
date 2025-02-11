import java.util.Scanner;

class Check {
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

         System.out.print("Enter an integer: ");
         int num = s.nextInt();

         if (num % 2 == 0) {
             System.out.println(num + " is Even.");
         } else {
             System.out.println(num + " is Odd.");
         }
     }

 }
