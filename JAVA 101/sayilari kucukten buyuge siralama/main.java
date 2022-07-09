//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int a,b,c;
        Scanner scn=new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz a= ");
        a=scn.nextInt();
        System.out.print("2. Sayiyi Giriniz b= ");
        b=scn.nextInt();
        System.out.print("3. Sayiyi Giriniz c= ");
        c=scn.nextInt();

        if ((a<b)&&(a<c)){
            if (b<c){
                System.out.println("a<b<c");
            }else {
                System.out.println("a<c<b");
            }
        }
        if ((b<a)&&(b<c)){
            if (a<c){
                System.out.println("b<a<c");
            }else {
                System.out.println("b<c<a");
            }
        }
        if ((c<a)&&(c<b)){
            if (a<b){
                System.out.println("c<a<b");
            }else {
                System.out.println("c<b<a");
            }
        }
    }

}
