import java.util.Scanner;

public class UcakBiletFiyati {
    public static void main(String[] args) {
        int distance, age, type;
        double kmUcret = 0.10, cost, totalFee, discountRate1 = 0.50, discountRate2 = 0.90, ticket, discountRate3 = 0.70, discountRate4 = 0.80;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in Km: ");
        distance = input.nextInt();
        System.out.print("Enter your Age : ");
        age = input.nextInt();
        System.out.println("Trip type\n" + "1-One way\n" + "2-Round Trip");
        type = input.nextInt();

        if (distance > 0 && age > 0) {


            if (type == 1) {

                if (age < 12) {

                    cost = distance * kmUcret;

                    ticket = cost * discountRate1;

                    System.out.println("Your Ticket Price : " + ticket + "TL");

                } else if (age > 12 && age < 24) {

                    cost = distance * kmUcret;

                    ticket = cost * discountRate2;

                    System.out.println("Your Ticket Price  :" + ticket + "TL");

                } else if (age > 65) {

                    cost = distance * kmUcret;

                    ticket = cost * discountRate3;

                    System.out.println("Your Ticket Price  :" + ticket + "TL");

                } else {

                    cost = distance * kmUcret;

                    System.out.println("Your Ticket Price  :" + cost + "TL");
                }
            } else if (type == 2) {

                if (age < 12) {

                    cost = distance * kmUcret;

                    ticket = cost * discountRate1;

                    totalFee = (ticket * discountRate4) * 2;

                    System.out.println("Your Ticket Price : " + totalFee);

                } else if (age > 12 && age < 24) {

                    cost = distance * kmUcret;

                    ticket = cost * discountRate2;

                    totalFee = (ticket * discountRate4) * 2;

                    System.out.println("Your Ticket Price: " + totalFee + "TL");

                } else if (age > 65) {

                    cost = distance * kmUcret;

                    ticket = cost * discountRate3;

                    totalFee = (ticket * discountRate4) * 2;

                    System.out.println("Your Ticket Price: " + totalFee);
                } else {

                    cost = distance * kmUcret;
                    ticket = cost * discountRate4;
                    totalFee = ticket * 2;

                    System.out.println("Your Ticket Price: " + totalFee + " TL");
                }
            } else {
                System.out.println("You Entered Wrong Type...");
            }
        } else {
            System.out.println("You entered the distance or age incorrectly.");
        }
    }
}

