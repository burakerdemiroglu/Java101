import java.util.Scanner;

public class ArtıkYilHesaplama {
    public static void main(String[] args) {
        int year ;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Year:");
        year = input.nextInt();


        if((year % 100)==0){
            if ((year %400)==0){
                System.out.println(year +" artık bir yıdlır");
            }else{
                System.out.println(year + " artık bir yıl degildir.");
            }
        }else {
            if ((year % 4)==0){
                System.out.println(year+" artık bir yıldır");
            }else{
                System.out.println(year +" artık bir yıl değildir.");
            }
        }
    }
}
