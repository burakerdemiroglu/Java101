
import java.util.Locale;
import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String userName, password, newPassword, varsayilanKullaniciAdi = "Burak", varsayilanSifre = "Erdemiroglu", sifreYenilenme;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Username: ");
        userName = input.nextLine();
        System.out.print("Enter Your Password: ");
        password = input.nextLine();

        if (userName.equals(varsayilanKullaniciAdi) && password.equals(varsayilanSifre)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Username or password is wrong.\n" + "If you want to enter a new password, please type yes:");
            sifreYenilenme = input.nextLine();

            if (sifreYenilenme.equals("yes")) {
                System.out.println("Enter new password");
                newPassword = input.nextLine();

                while (newPassword.equals(varsayilanSifre)) {
                    System.out.println("Could not create password. Please enter another password:");
                    newPassword = input.nextLine();
                }
                System.out.println("Password generated::" + newPassword);

            } else {
                System.out.println("Could not create password");
            }


        }
    }
}