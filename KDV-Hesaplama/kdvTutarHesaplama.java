import java.util.Scanner;

public class kdvTutarHesaplama {
    public static void main(String[] args) {
        double enteredFee, kdv1 = 0.18, kdv2 = 0.08, vatAmount, amountwithVat, amountwithVat1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Fee Amount");
        enteredFee = input.nextDouble();

        if

        (enteredFee >= 0 && enteredFee <= 1000) {

            vatAmount = enteredFee * kdv1;
            amountwithVat = vatAmount + enteredFee;
            amountwithVat1 = enteredFee * kdv1;


        } else {

            vatAmount = enteredFee * kdv2;
            amountwithVat = vatAmount + enteredFee;
            amountwithVat1 = enteredFee * kdv2;

        }
        System.out.println("Amount " + enteredFee);
        System.out.println("Amount With Vat  " + amountwithVat);
        System.out.println("VAT Amount" + kdv1);
        System.out.println("Amount With Vat  " + amountwithVat1);

    }
}

