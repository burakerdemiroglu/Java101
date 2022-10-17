import java.util.Scanner;

public class ÜslüSayıHesaplama {
    public static void main(String[] args) {
        int i, k, total = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number to be exponentiated:");
        i = input.nextInt();
        System.out.print("exponent number:");
        k = input.nextInt();

        //matematiksel işlem bloğu
        if (i > 0 && k > 0) {

            for (int m = 1; m <= k; m++) {

                total *= i;
            }
            System.out.print("Result :" + total);

        } else {
            System.out.println("Please enter a value greater than 0.");
        }
    }
}
