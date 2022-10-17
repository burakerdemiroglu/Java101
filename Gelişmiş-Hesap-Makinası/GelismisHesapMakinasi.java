
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GelismisHesapMakinasi {

    static void toplama() {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Enter Number :");
        int ilkSayi = input.nextInt();
        System.out.print("2. Enter Number :");
        int ikinciSayi = input.nextInt();

        int total = ilkSayi + ikinciSayi;

        System.out.println("Result of Addition: " + total);

    }

    static void cıkarma() {

        Scanner input = new Scanner(System.in);
        System.out.print("1. Enter Number:");
        int ilkSayi = input.nextInt();
        System.out.print("2. Enter Number:");
        int ikinciSayi = input.nextInt();

        int total = ilkSayi - ikinciSayi;

        System.out.println("Result of Subtraction : " + total);
    }

    static void carpma() {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Enter Number :");
        int ilkSayi = input.nextInt();
        System.out.print("2. Enter Number:");
        int ikinciSayi = input.nextInt();

        int total = ilkSayi * ikinciSayi;

        System.out.println("Result of Multiplication: " + total);
    }

    static void bolme() {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Enter Number :");
        int ilkSayi = input.nextInt();
        System.out.print("2. Enter Number :");
        int ikinciSayi = input.nextInt();

        if (ilkSayi == 0 || ikinciSayi == 0) {
            System.out.println("You cannot enter the divisor 0:");
        }
        int total = ilkSayi / ikinciSayi;

        System.out.println("Result of Division: " + total);
    }

    static void usAlma() {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Enter Number:");
        int ilkSayi = input.nextInt();
        System.out.print("2. Enter Number:");
        int ikinciSayi = input.nextInt();

        int total = 1;
        for (int i = 1; i <= ikinciSayi; i++) {
            total = total * ilkSayi;
        }
        System.out.println("Result of Exponentiation: " + total);
    }

    static void faktoriyel() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Factorial Number:");
        int ilkSayi = input.nextInt();

        int result = 1;

        for (int i = 1; i <= ilkSayi; i++) {
            result *= i;
        }
        System.out.println("Result of Factorial Operation:" + result);
    }

    static void Mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Enter Number :");
        int ilkSayi = input.nextInt();
        System.out.print("2. Enter Number:");
        int ikinciSayi = input.nextInt();

        int total = ilkSayi % ikinciSayi;

        System.out.println("Result of Modification:" + total);
    }

    static void ucgenvecevre() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base :");
        int ilkSayi = input.nextInt();
        System.out.print("Enter Height :");
        int ikinciSayi = input.nextInt();

        int Alan = ilkSayi * ikinciSayi;
        int Cevre = (ilkSayi + ikinciSayi) * 2;

        System.out.println("Area :" + Alan);
        System.out.println("Environment :" + Cevre);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "Collection Operation \n"
                + "2 - Subtraction \n"
                + "3 - Multiplication\n"
                + "4 - Division \n"
                + "5 - Exponent Calculation\n"
                + "6 - Factorial Calculation\n"
                + "7 - Get Mod \n"
                + "8 - Rectangular Area and Perimeter Calculation \n"
                + "9 - Sign out";
        System.out.println(menu);
        while (true) {
            System.out.print("Select the action you want to do:");
            int select = input.nextInt();

            switch (select) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cıkarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usAlma();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    Mod();
                    break;
                case 8:
                    ucgenvecevre();
                    break;

            }
            if (select == 9) {
                System.out.println("Exiting the System...");
                break;
            }

        }
    }
}
