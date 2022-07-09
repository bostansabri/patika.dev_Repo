//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double kilo, boy, vki;

        Scanner std=new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz: ");
        boy=std.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz: ");
        kilo=std.nextDouble();

        vki=kilo/(boy*boy);
        System.out.println("Vucut Kitle Indeksiniz: "+vki);


    }
}
