import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        int kalanHak = 3;
        int bakiye = 1500;
        int select;
        Scanner input = new Scanner(System.in);


        while (kalanHak > 0) {

            System.out.print("Kullanıcı Adınızı Giriniz:");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz :");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("java123")) {

                System.out.println("Merhaba.Kodluyoruz bankasına Hoşgeldiniz.!");
                do {

                    System.out.println("1-Para Yatırma \n" + "2-Para Çekme \n" + "3-Bakiye Sorgula \n" + "4-Çıkış yap");
                    System.out.print("Lütfen yapmak istediğinizi işlemi seçiniz :");
                    select = input.nextInt();
                    switch (select) {
                        case 1: {
                            System.out.println("Lütfen yatırmak istediğiniz Tutarı giriniz :");
                            int para = input.nextInt();
                            bakiye += para;
                            System.out.println("İşlem sonunda ki bakiyeniz :" + bakiye);
                            break;
                        }
                        case 2 : {
                            System.out.println("Lütfen çekmek istediğiniz Tutarı giriniz :");
                            int para = input.nextInt();
                            if (para > bakiye) {
                                System.out.println("Bakiyeniz yetersizdir.");
                            } else {
                                bakiye -= para;
                                System.out.println("İşlem sonunda ki bakiyeniz :" + bakiye);
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("Bakiyeniz :"+bakiye);

                            break;
                        }
                    }
                    System.out.println();

                } while (select != 4);

                System.out.println("Tekrar görüşmek deliğiyle .");
                break;

            } else {

                kalanHak--;

                System.out.println("Hatalı kullanıcı adı veya şifre.Tekrar deneyiniz.");

                if (kalanHak == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız :" + kalanHak);
                }
            }


        }


    }
}
