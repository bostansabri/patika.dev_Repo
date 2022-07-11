//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int a, b;
        int total=1;

        System.out.print("Ussu Alinacak Sayiyi Giriniz: ");
        a=scn.nextInt();
        System.out.print("Us Olacak Sayi: ");
        b=scn.nextInt();

        for (int i=1;i<=b;i++){
            total*=a;

        }
        System.out.println("Sonuc: "+total);
    }
}

