import java.util.Scanner;

public class NtanesayıSıralama {
    public static void main(String[] args) {
        int i,sayi,büyüksayi=0,kücüksayi=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz :");
        i = input.nextInt();
        for (int k = 1; k <= i; k++) {
            System.out.print( k + ". Sayıyı giriniz : ");
            sayi = input.nextInt();
            if (sayi==1){
                büyüksayi=sayi;
                kücüksayi=sayi;
            }else if(sayi>büyüksayi){
                büyüksayi=sayi;
            }else if (sayi<kücüksayi){
                kücüksayi=sayi;
            }
        }
        System.out.println("Büyük sayı :"+büyüksayi);
        System.out.println("Küçük sayı :"+kücüksayi);
    }
}
