import java.util.Scanner;

public class HesapMakinası {
    public static void main(String[] args) {

        int firstNumber, secondNumber, select;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number :");
        firstNumber = input.nextInt();
        System.out.print("Enter the second number :");
        secondNumber = input.nextInt();

        System.out.println("1-Gathering\n" + "2-Removal\n" + "3-Division\n" + "4-Multiplication");

        System.out.print("What action would you like to do?");
        select = input.nextInt();


        switch (select) {
            case 1:
                System.out.println("Conclusion :" + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println("Conclusion :" + (firstNumber - secondNumber));
                break;
            case 3:
                if (secondNumber != 0) {
                    System.out.println("Conclusion : " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Creates a reconstruction of a number to zero.");
                }
                break;
            case 4:
                System.out.println("Conclusion :" + (firstNumber * secondNumber));
                break;
            default:
                System.out.println("You entered the wrong value.");
        }

    }


}
