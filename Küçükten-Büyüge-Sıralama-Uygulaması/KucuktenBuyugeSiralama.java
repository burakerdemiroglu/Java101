import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Enter the number:");
        a = input.nextInt();
        System.out.print("2. Enter the number:");
        b = input.nextInt();
        System.out.print("3. Enter the number:");
        c = input.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.println( a +" < " + b + " < " + c);
            } else
                System.out.println( a +" < " + c + " < " + b);
        }
        if (b < a && b < c) {
            if (a < c) {
                System.out.println( b +" < " + a + " < " + c);
            } else
                System.out.println( b +" < " + c + " < " + a);
        }
        if (c < b && c < a) {
            if (b < a) {
                System.out.println( c +" < " + b + " < " + a);
            } else
                System.out.println( c +" < " + a + " < " + b );
        }
    }
}
