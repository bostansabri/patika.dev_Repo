//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //kullanıcı adı patika, şifre 101

        String userName, password, resetPassword, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici Adinizi Giriniz: ");
        userName = input.nextLine();

        System.out.print("Sifrenizi Giriniz: ");
        password = input.nextLine();

        if ((userName.equals("patika")) && (password.equals("java101"))) {
            System.out.println("Giris Yaptiniz!");
        } else {
            System.out.println("Kullanici Adi veya Sifre Yanlis!");
            System.out.print("Sifrenizi Sifirlamak Ister Misiniz? ");
            resetPassword = input.nextLine();
            if (resetPassword.equals("evet")) {
                System.out.print("Yeni Sifrenizi Yaziniz: ");
                newPassword=input.nextLine();
                if (newPassword.equals("java101")) {
                    System.out.println("Sifre Olusturulamadi, lutfen baska sifre giriniz!");
                }else {
                    System.out.println("Sifre Olusturuldu.");
                }

            }else{
                System.out.println("Giris Basarisiz!");
            }
        }
    }
}
