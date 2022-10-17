import java.sql.SQLOutput;
import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Temperature Value:");
        heat = input.nextInt();

        if (heat <= 5) {
            System.out.println("You can Ski.");
        } else if (5 < heat && heat <= 10) {
            System.out.println("You can go to the Cinema.");
        } else if (10 < heat && heat <= 15) {
            System.out.println("You can go to the Movies and Picnic.");
        } else if (15 < heat && heat <= 25) {
            System.out.println("You can go to the Picnic.");
        } else if (25 < heat && heat <= 35) {
            System.out.println("You can go Swimming");
        } else if (35 < heat) {
            System.out.println("Please sit at Home :) ...");
        }


    }
}
