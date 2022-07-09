//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int n1, n2, select;
        Scanner scn=new Scanner(System.in);

        System.out.print("Ilk Sayiyi Giriniz: ");
        n1=scn.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        n2=scn.nextInt();

        System.out.println("1- Toplama\n2- Cikarma\n3- Carpma\n4- Bolme");
        System.out.print("Seciminiz: ");
        select=scn.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuc: "+(n1+n2));
                break;
            case 2:
                System.out.println("Sonuc: "+(n1-n2));
                break;
            case 3:
                System.out.println("Sonuc: "+(n1*n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Bir Sayi Sifira Bolunemez!!!");
                } else
                    System.out.println("Sonuc: "+(n1/n2));
                break;
            default:
                System.out.println("Hatali Bir Giris Yaptiniz!");
        }

    }
}
