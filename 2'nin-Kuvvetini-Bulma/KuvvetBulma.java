package GirilenSayidanKucuk2ınnkuvvetinibulanprogram;

import java.util.Scanner;


public class KuvvetBulma {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number :");
        i = input.nextInt();
        System.out.println("Numbers with powers of 4:");
        for (int k = 1; k <= i; k *= 4) {
            System.out.print(k + ",");

        }
        System.out.println();
        System.out.println("Numbers with powers of 5 :");
        for (int k = 1; k <= i; k *= 5) {
            System.out.print(k + ",");
        }
    }
}
