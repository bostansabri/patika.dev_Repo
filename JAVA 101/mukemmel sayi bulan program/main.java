//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int number;
        int total=0;

        System.out.print("Bir Sayi Giriniz: ");
        number=scn.nextInt();

        for (int i=1; i<number; i++){
            if(number%i==0){
                total+=i;
            }
        }
        if (total==number){
            System.out.println(total+" Mukemmel Sayidir.");
        }else {
            System.out.println(number+" Mukemmel Sayi Degildir.");
        }
    }
}
