//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;           //Girilen Ücret Tutarı
        double b;           //KDV'li Fiyat
        double c;           //KDV Tutarı
        double d;           //KDV Oranı
        double e;           //KDV'nin %8 mi %18 mi olacağının seçimi.

        System.out.print("Ucret Tutarini Giriniz: ");
        a=input.nextDouble();

        boolean kosul=a>=1000;
        e=kosul?8:18;

        c=(a*e)/100;        //KDV tutarı hesaplanır
        b=a+c;              //Girilen ücrete KDV tutarı eklenir.

        System.out.println("KDV'siz Fiyat: "+a);
        System.out.println("KDV'li Fiyat: "+b);
        System.out.println("KDV Tutari: "+c);


    }
}
