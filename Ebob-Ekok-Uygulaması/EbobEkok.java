import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the N1 value: ");
        int n1 = input.nextInt();
        System.out.print("Enter the N2 value: :");
        int n2 = input.nextInt();


        int ebob = 1;
        int ekok = 1;
        int i = 1;
        int k =1 ;


        if (n1 < n2) {
            int tempN1 = n1,tempN2 = n2;
            n1=tempN2;
            n2=tempN1;
        }

        while (i <= n2) {

            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }


        while (k <= (n1*n2)) {

            if (k % n1 == 0 && k % n2 == 0) {

                ekok = k;
                break ;
            }
            k++;
        }

        //ekok = (n1 * n2) / ebob;


        System.out.println("--------------------");


        System.out.println("Greatest common divisor of N1 and N2 Numbers:" + ebob);
        System.out.println("Least common divisor of N1 and N2 Numbers:" + ekok);
    }
}
