//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        matematik=input.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik=input.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya=input.nextInt();

        System.out.print("Turkce Notunuz:");
        turkce=input.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih=input.nextInt();

        System.out.print("Muzik Notunuz:");
        muzik=input.nextInt();

        int toplam=(matematik+fizik+kimya+turkce+tarih+muzik);
        double sonuc= (toplam/6.0);

        System.out.println("Not Ortalamaniz: "+ sonuc);

        boolean kosul1=sonuc>=60;
        boolean kosul2=sonuc<60;
        String str=kosul1?"Sinifi Gectiniz":"Sinifta Kaldiniz";

        System.out.println(str);


    }
}
