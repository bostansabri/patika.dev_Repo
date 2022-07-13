//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Kullanıcı Adı: patika, Şifre: dev123

        Scanner scn=new Scanner(System.in);

        String kullaniciAdi, sifre;
        int select, hesaptakiPara=1000;
        int d=3;

        while (d>0) {
        System.out.print("Kullanici Adinizi Giriniz: ");
        kullaniciAdi=scn.nextLine();
        System.out.print("Sifrenizi Giriniz: ");
        sifre=scn.nextLine();

            if (kullaniciAdi.equals("patika") && sifre.equals("dev123")) {
                System.out.println("Kodluyoruz Bankasina Hos Geldiniz!");

                do{
                    System.out.println("1- Para Yatirma.\n2- Para Cekme.\n3- Bakiye Sorgulama.\n4- Cikis Yap.");
                    System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz: ");
                    select = scn.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatirilacak Tutari Giriniz: ");
                            int p = scn.nextInt();
                            hesaptakiPara += p;
                            break;
                        case 2:
                            System.out.print("Cekilecek Tutari Giriniz: ");
                            int c = scn.nextInt();
                            if (hesaptakiPara < c) {
                                System.out.println("Bakiyeniz Yetersiz!");
                            } else
                                hesaptakiPara -= c;
                            break;
                        case 3:
                            System.out.println("Hesap Bakiyeniz: " + hesaptakiPara + " TL");
                            break;
                    }

                } while (select!=4);
                    System.out.println("Cikis Basarili, Gorusmek Uzere!");
                    break;
            }else {
                d--;
                System.out.println("Hatali Kullanici Adi veya Sifre. Tekrar Deneyiniz!");
                if (d==0){
                    System.out.println("Hesabiniz Bloke Olmustur. Lutfen Bankaniz Ile Iletisime Geciniz!");
                }else {
                    System.out.println("Kalan Hakkiniz: "+d);
                }
            }
        }
    }
}
