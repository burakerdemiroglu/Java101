package Taksimetre;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double cost, openingFee = 10, km = 2.20;
        int kmDegeri;

        Scanner input = new Scanner(System.in);


        System.out.print("Mileage Value :");

        kmDegeri = input.nextInt();

        cost = openingFee + (km * kmDegeri);

        cost = (cost < 20) ? 20 : cost;

        System.out.print("Taxi Fare: " + cost);

    }

}
