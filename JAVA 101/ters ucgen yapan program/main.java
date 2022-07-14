//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int basSayisi;

        System.out.print("Basamak Sayisini Giriniz: ");
        basSayisi=scn.nextInt();

        for (int i=0; i<=basSayisi; i++){
            for (int a=1; a<=i; a++){
                System.out.print(" ");
            }
            for (int b=1; b<=(2*basSayisi-(2*i+1)); b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
