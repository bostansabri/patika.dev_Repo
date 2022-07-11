//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n; int r;
        int nFak=1;
        int rFak=1;
        int cFak=1;
        int cikarma;
        double sonuc;

        System.out.print("Eleman Sayisini Giriniz n: ");
        n=scn.nextInt();
        System.out.print("Eleman Sayisini Giriniz r: ");
        r=scn.nextInt();

        for (int i=1;i<=n;i++){
            nFak*=i;
        }
        for (int i=1;i<=r;i++){
            rFak*=i;
        }
        cikarma= n-r;
        for (int s=1;s<=cikarma;s++){
            cFak*=s;
        }

        sonuc=(nFak)/(rFak*cFak);
        System.out.println("C("+n+","+r+")= "+ sonuc);

    }
}
