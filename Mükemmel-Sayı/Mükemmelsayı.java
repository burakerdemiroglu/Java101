import java.util.Scanner;

public class Mükemmelsayı {
    public static void main(String[] args) {
        int toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number :");
        int k = input.nextInt();

        for (int i = 1; i < k; i++) {

            if (k % i == 0){
                toplam+=i;

            }
        }
        if (toplam==k){
            System.out.println(toplam+" It's the perfect number.");
        }else{
            System.out.println(k+" It's not a perfect number.");
        }


    }
}
