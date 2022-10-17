import java.util.Locale;
import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        String mounth;
        int day;

        Scanner input = new Scanner(System.in);
        System.out.print("the month you were born  : ");
        mounth = input.nextLine().toLowerCase();

        System.out.print("the day you were born:");
        day = input.nextInt();

        if (mounth.equals("fireplace")) {
            if (day >= 22 && day <= 31) {
                System.out.println("You are an Aquarius..");
            } else if (day <= 21 && day <= 31) {
                System.out.println("You are a Capricorn");
            } else {
                System.out.println("You entered incorrectly");
            }

        } else if (mounth.equals("subat")) {
            if (day >= 20 && day <= 31) {
                System.out.println("You are a Pisces..");
            } else if (day <= 19 && day <= 31) {
                System.out.println("You are an Aquarius");
            } else {
                System.out.println("You entered incorrectly");
            }

        } else if (mounth.equals("mart")) {
            if (day >= 21 && day <= 31) {
                System.out.println("You are an Aries.");
            } else if (day <= 20 && day <= 31) {
                System.out.println("You are a Pisces.");
            } else {
                System.out.println("You entered incorrectly");
            }

        } else if (mounth.equals("nisan")) {
            if (day >= 21 && day <= 31) {
                System.out.println("You are a Taurus.");
            } else if (day <= 20 && day <= 31) {
                System.out.println("You are an Aries.");
            } else {
                System.out.println("You entered incorrectly");
            }

        } else if (mounth.equals("mayıs")) {
            if (day >= 22 && day <= 31) {
                System.out.println("You are a Gemini.");
            } else if (day <= 21 && day <= 31) {
                System.out.println("You are a Taurus.");
            } else {
                System.out.println("You entered incorrectly");
            }

        } else if (mounth.equals("haziran")) {
            if (day >= 23 && day <= 31) {
                System.out.println("You are a Crab");
            } else if (day <= 22 && day <= 31) {
                System.out.println("You are a Gemini.");
            } else {
                System.out.println("You entered incorrectly");
            }

        } else if (mounth.equals("temmuz")) {
            if (day >= 23 && day <= 31) {
                System.out.println("You are a Leo.");
            } else if (day <= 22 && day <= 31) {
                System.out.println("You are a Crap");
            } else {
                System.out.println("You entered incorrectly");
            }

        } else if (mounth.equals("agustos")) {
            if (23 >= day && day <= 31) {
                System.out.println("you are a Virgo");
            } else if (day <= 22 && day <= 31) {
                System.out.println("You are a Leo.");
            } else {
                System.out.println("You entered incorrectly");
            }

        } else if (mounth.equals("eylul")) {
            if (day >= 23 && day <= 31) {
                System.out.println("You are Libra");
            } else if (day <= 22 && day <= 31) {
                System.out.println("you are a Virgo");
            } else {
                System.out.println("You entered incorrectly");
            }

        } else if (mounth.equals("ekim")) {
            if (day >= 23 && day <= 31) {
                System.out.println("You are Scorpio.");
            } else if (day <= 22 && day <= 31) {
                System.out.println("TYou are Libra");
            } else {
                System.out.println("You entered incorrectly");
            }

        } else if (mounth.equals("kasim")) {
            if (day >= 22 && day <= 31) {
                System.out.println("You are a Sagittarius.");
            } else if (day <= 21 && day <= 31) {
                System.out.println("You are Scorpio .");
            } else {
                System.out.println("You entered incorrectly");
            }

        } else if (mounth.equals("aralik")) {
            if (day >= 22 && day <= 31) {
                System.out.println("Oğlak  burcusunuz .");
            } else if (day <= 21 && day <= 31) {
                System.out.println("You are a Sagittarius.");
            } else {
                System.out.println("You entered incorrectly");
            }

        } else {
            System.out.println("You entered the wrong month");
        }


    }

}



