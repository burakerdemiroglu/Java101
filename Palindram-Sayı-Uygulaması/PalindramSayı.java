import java.util.Scanner;

public class PalindramSayı {

    static String isPalindram(int sayi) {
        int temp = sayi, lastNumber, terssSayi = 0;
        while (temp != 0) {

            lastNumber = temp % 10;
            terssSayi = terssSayi * 10 + lastNumber;
            temp /= 10;
        }
         return
               sayi == temp ? sayi+" Polydrama is number" : sayi+" A polydrome is not a number.";
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number:");
        int a=input.nextInt();

        System.out.print(isPalindram(a));

    }
}