import java.util.Scanner;

public class UcgendeAlan {
    public static void main(String[] args) {
        int a, b;
        double area, environment, U, c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Enter Edge: ");
        a = input.nextInt();
        System.out.print("2. Enter Edge : ");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));

        System.out.println("3. Edge :" + c);


        environment = a + b + c;

        U = environment / 2;

        System.out.println("Environment:" + environment);
        area = Math.sqrt(U * (U - a) * (U - b) * (U - c));
        System.out.println("Area : " + area);


    }
}
