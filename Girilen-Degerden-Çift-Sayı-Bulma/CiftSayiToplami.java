import java.util.Scanner;

public class CiftSayiToplami {
    public static void main(String[] args) {
        int k, total = 0;

        Scanner input = new Scanner(System.in);

        do {

            System.out.print("Enter Number :");
            k = input.nextInt();

            if (k % 4 == 0) {
                total+=k;
            }


        } while (k % 2 == 0);

        System.out.println();
        System.out.println("sum of even and multiples of 4 from the entered values :" +total);
    }
}
