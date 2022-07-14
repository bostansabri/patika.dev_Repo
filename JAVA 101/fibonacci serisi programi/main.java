//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int elemanSayisi;
        int ilkSayi=0;
        int a=1;
        int sonSayi;

        System.out.print("Fibonacci Serisinin Eleman Sayisini Giriniz: ");
        elemanSayisi=scn.nextInt();

        for (int i=0; i<=elemanSayisi;i++){
            sonSayi=ilkSayi+a;
            System.out.println(ilkSayi+"+"+a+"="+sonSayi);
            ilkSayi=a;
            a=sonSayi;
            System.out.println();
        }
    }
}
