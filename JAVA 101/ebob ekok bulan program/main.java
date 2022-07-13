//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n1, n2;
        int ebob=1;
        int ekok;

        System.out.print("n1 Sayisini Giriniz: ");
        n1=scn.nextInt();
        System.out.print("n2 Sayisini Giriniz: ");
        n2=scn.nextInt();

        int i=n1;
        while (n1>0){
                if (n1%i==0&&n2%i==0) {
                    ebob=i;
                    System.out.println("EBOB: "+ebob);
                    break;
                }else {
                    i--;
                }
        }

        ekok=(n1*n2)/ebob;
        System.out.println("EKOK: "+ekok);

    }
}
