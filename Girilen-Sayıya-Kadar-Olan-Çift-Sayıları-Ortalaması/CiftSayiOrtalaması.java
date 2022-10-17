import java.util.Scanner;

public class CiftSayiOrtalaması {
    public static void main(String[] args) {

        int k,average=0,number=0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Number : ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++) {

            if (i % 12 == 0) {

                average+=i;
                number+=1;
            }
        }
        System.out.print("Average of numbers divisible by 3 and 4 : " +average/number);

    }
}
