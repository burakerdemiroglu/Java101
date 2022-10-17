import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        //Değişken tanımlama
        double Pear = 2.14, Apple = 3.67, Tomatoes = 1.11, Banana = 0.95, Eggplant = 5, totalAmount;
        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;

        Scanner input = new Scanner(System.in);
        //Kullanıcıdan istenen bilgiler
        System.out.print("How Many Kilos of Pear :");
        pearKg = input.nextDouble();
        System.out.print("How Many Kilos of Apple :");
        appleKg = input.nextDouble();
        System.out.print("How Many Kilos of Tomatoes :");
        tomatoKg = input.nextDouble();
        System.out.print("How Many Kilos of Banana :");
        bananaKg = input.nextDouble();
        System.out.print("How Many Kilos of Eggplant :");
        eggplantKg = input.nextDouble();
        //Formül

        totalAmount = (Pear * pearKg + Apple * appleKg + Tomatoes * tomatoKg + Banana * bananaKg + Eggplant * eggplantKg);

        //Ekran Sonuç Çıktısı

        System.out.println("Total Amount: " + totalAmount + " TL");

    }
}
