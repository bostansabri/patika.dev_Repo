//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int sayi;
        Scanner scn=new Scanner(System.in);

        System.out.print("Yil Giriniz: ");
        sayi=scn.nextInt();

        if (sayi%100!=0&&sayi%4==0){
            System.out.println(sayi+" bir artik yildir!");
        } else if(sayi%100==0&&sayi%400==0){
            System.out.println(sayi+" bir artik yildir!");
        }
        else {
            System.out.println(sayi+" bir artik yil degildir!");
        }
    }
}
