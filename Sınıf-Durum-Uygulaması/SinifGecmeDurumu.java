
import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int math, physics, turkish, chemical, music, totalGrade = 0, counter = 0;
        Scanner input = new Scanner(System.in);


        System.out.print("Enter your math grade :");
        math = input.nextInt();
        while (math < 0 || math > 100) {
            System.out.println("The course grade should be between 0 and 100.\n" + "Please re-enter your Mathematics grade");
            math = input.nextInt();
        }

        System.out.print("Enter your physics note:");
        physics = input.nextInt();
        while (physics < 0 || physics > 100) {
            System.out.println("The course grade should be between 0 and 100.\n" + "Please re-enter your Physics grade:");
            physics = input.nextInt();
        }

        System.out.print("Enter your turkish note:");
        turkish = input.nextInt();
        while (turkish < 0 || turkish > 100) {
            System.out.println("The course grade should be between 0 and 100.\n" + "Please re-enter your Turkish note:");
            turkish = input.nextInt();
        }

        System.out.print("Enter your chemistry note:");
        chemical = input.nextInt();
        while (chemical < 0 || chemical > 100) {
            System.out.println("The course grade should be between 0 and 100.\n" + "Please re-enter your Chemistry grade:");
            chemical = input.nextInt();
        }

        System.out.print("Enter your music note:");
        music = input.nextInt();
        while (music < 0 || music > 100) {
            System.out.println("The course grade should be between 0 and 100.\n" + "Please re-enter your music note:");
            music = input.nextInt();
        }

        totalGrade = music + math + turkish + chemical + physics;

        counter = 5;

        double average = totalGrade / counter;


        if (average <= 55) {
            System.out.print("Your Average:" + average + "  Grade Repetition");
        } else {
            System.out.println("Your Average:" + average + " You Passed the Class");
        }
    }
}