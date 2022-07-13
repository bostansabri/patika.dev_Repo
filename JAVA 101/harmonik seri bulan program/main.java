//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n;
        double result=0;

        System.out.print("n sayisini giriniz: ");
        n=scn.nextInt();

        for (double i=1;i<=n;i++){
         result+=(1.0/i);
        }
        System.out.println("Sonuc: "+result);
    }
}
