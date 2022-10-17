import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int basamakSayisi = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value :");
        int k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            for (int b = 1; i>b; b++) {
                System.out.print(" ");
            }


            for (int a = 1; a <= (2 * (k - i) - 1); a++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
