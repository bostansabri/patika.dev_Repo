//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int number;
        int toplam=0;

        System.out.print("Bir Sayi Giriniz: ");
        number=scn.nextInt();

        while (number!=0){
            toplam+=number%10;
            number/=10;
        }
        System.out.println("Basamak Sayilarinin Toplami: "+toplam);
    }
}
