import java.util.Scanner;

public class ElmasOlusturma {
    public static void main(String[] args) {
        int n, basamaksayisi = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number :");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (2 * i + 1); l++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = n; 0 < i; i--) {

            for (int m = (n - i); m >= 0; m--) {

                System.out.print(" ");
            }
            for (int l = (2 * i - 2); l >= 0; l--) {

                System.out.print("*");

            }
            System.out.println();


        }

    }
}
