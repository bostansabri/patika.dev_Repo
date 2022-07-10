//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int i;
        int t=0;

        do{
            System.out.print("Sayi Giriniz: ");
            i=scn.nextInt();
            if (i%2==0&&i%4==0){
                t=i+t;
            }
        }while (i%2==0);

        System.out.println("Toplam Deger: "+t);

    }
}
