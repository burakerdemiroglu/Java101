import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 1, c;
        System.out.print("Enter a number:");
        int sayi = input.nextInt();

        for (int i = 2; i <= sayi; i++) {

            c = a + b;
            System.out.print(a + " + " + b + " = " + c);
            a = b;
            b = c;
            System.out.println();

        }
    }
}
