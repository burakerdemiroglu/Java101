
import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {

        //Değişkenleri tanımlayalım.
        int Maths, Physics, History, Chemical, Turkish, Music;

        //Scanner sınıfını tanımlayalım.
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan bilgi alma
        System.out.print("Enter Your Math Grade:");
        Maths = inp.nextInt();


        System.out.print("Enter your Physics Note:");
        Physics = inp.nextInt();


        System.out.print("Enter Your Chemistry Grade:");
        Chemical = inp.nextInt();


        System.out.print("Enter Your History Date Note:");
        History = inp.nextInt();


        System.out.print("Enter your Turkish Note:");
        Turkish = inp.nextInt();


        System.out.print("Enter Your Music Note:");
        Music = inp.nextInt();

        int totalValue = (Maths + Physics + Chemical + History + Turkish + Music);

        double Conclusion = totalValue / 6;

        System.out.println("Your GPA: " + Conclusion);

        String status = Conclusion >= 60 ? "You Passed The Class." : "You Failed in Class ";

        System.out.println(status);


    }
}