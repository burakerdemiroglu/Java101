import java.util.Scanner;

public class BasamakSayiToplamı {
    public static void main(String[] args) {
        int i, basNumber = 0, result = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        i = input.nextInt();


        while (i != 0) {
            result += i % 10;
            i /= 10;
            basNumber++;
        }
        System.out.println("Total Number of Digits:"+result);
        System.out.println("Number of Digits:"+basNumber);

    }
}
