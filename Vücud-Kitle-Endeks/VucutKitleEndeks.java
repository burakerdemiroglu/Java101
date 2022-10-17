import java.util.Scanner;

public class VucutKitleEndeks {
    public static void main(String[] args) {
        //Değişkenleri Tanımlayalım.
        double weight, height, kitleEndeks;

        Scanner input = new Scanner(System.in);
        //Kullanıcıdan istenen bilgiler
        System.out.print("Please enter your height (in metres): ");
        height = input.nextDouble();
        System.out.print("Please enter your weight :");
        weight = input.nextDouble();
        //Formül
        kitleEndeks = weight / (height * height);
        //Ekran çıktısı
        System.out.println("Body Mass Index: " + kitleEndeks);
    }
}
