import java.util.Scanner;

public class DaireAlanVeCevre {
    public static void main(String[] args) {
        //KULLANICAĞIMIZ DEĞİŞKEN TANIMLAMA NOKTASI
        int r;
        double area, pi = 3.14, merkezacıOlcusu;
        //Scanner kütüphanesi
        Scanner input = new Scanner(System.in);
        // KULLANICIDAN İSTENEN YARI ÇAP ALANI
        System.out.print("Enter the radius:");
        r = input.nextInt();
        //KULLANICIDAN İSTENEN AÇI ÖLCÜ ALANI
        System.out.print("Enter the central angle measure:");
        merkezacıOlcusu = input.nextDouble();

        //FORMÜL KISMI
        area = (pi * (r * r) * merkezacıOlcusu) / 360;
        //SONUÇ
        System.out.println("Area : " + area);


    }
}
