import java.util.Scanner;

public class CinZodyagı {
    public static void main(String[] args) {
        int year, remainder;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Birth Year : ");
        year = input.nextInt();

        remainder = year % 12;

        switch (remainder) {

            case (0):
                System.out.println("Your Chinese Zodiac Sign: Monkey");
                break;
            case (1):
                System.out.println("Your Chinese Zodiac sign: Rooster");
                break;
            case (2):
                System.out.println("Your Chinese Zodiac sign: Dog");
                break;
            case (3):
                System.out.println("Your Chinese Zodiac sign: Pig");
                break;
            case (4):
                System.out.println("Your Chinese Zodiac sign: Mouse");
                break;
            case (5):
                System.out.println("Your Chinese Zodiac sign: Ox");
                break;
            case (6):
                System.out.println("Your Chinese Zodiac Sign: Tiger");
                break;
            case (7):
                System.out.println("Your Chinese Zodiac Sign: Rabbit");
                break;
            case (8):
                System.out.println("Your Chinese Zodiac Sign: Dragon");
                break;
            case (9):
                System.out.println("Your Chinese Zodiac Sign: Snake");
                break;
            case (10):
                System.out.println("Your Chinese Zodiac Sign: Horse");
                break;
            case (11):
                System.out.println("Your Chinese Zodiac Sign: Sheep");
                break;

        }
    }
}
