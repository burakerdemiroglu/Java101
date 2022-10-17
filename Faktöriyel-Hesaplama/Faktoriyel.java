import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int n, r, ntotal = 1, rtotal = 1, nrtotal = 1, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N Value");
        n = input.nextInt();
        System.out.print("Enter R Value");
        r = input.nextInt();

        if (n > 0 && r > 0 && (n - r) > 0) {

            for (int k = 1; k <= n; k++) {

                ntotal = ntotal * k;

            }
            for (int s = 1; s <= r; s++) {

                rtotal = rtotal * s;

            }
            for (int m = 1; m <= (n - r); m++) {

                nrtotal = nrtotal * m;

            }

            result = ntotal / (rtotal * nrtotal);

            System.out.print("C (" + n + "," + r + ") = " + result);

        } else {
            System.out.println("R value cannot be greater than N value.");
        }
    }
}