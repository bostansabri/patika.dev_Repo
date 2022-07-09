//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int k;
        int t=0, tN=0;
        double a;

        System.out.print("Bir Sayi Giriniz: ");
        k=scn.nextInt();

        for (int i=0; i<=k; i++){
            if (i%3==0&&i%4==0){
                t+=i;
                tN++;
            }
        }
        a=(t/(tN-1));
        System.out.println("Ortalama: "+a);
    }
}
