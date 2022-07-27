//www.patika.dev

import java.util.Scanner;

public class main {

    static void asal(int a){

        for (int i=2;i<=a;i++){
            if(a==2){
                System.out.println(a+" sayisi ASALDIR !");
                return;
            }
            else if(a%i==0){
                System.out.println(a+" sayisi ASAL degildir !");
                return;
            }
            else if (i*i>a){
                System.out.println(a+" sayisi ASALDIR !");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int a=scn.nextInt();
        asal(a);

    }
}
