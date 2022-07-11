//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int i, n;

        System.out.print("Sinir Sayisini Giriniz: ");
        n=scn.nextInt();

        System.out.println("4'un Kuvvetleri:");
        for (i=1;i<=n;i*=4){
            System.out.println(i);
        }

        System.out.println("5'in Kuvvetleri:");
        for (i=1;i<=n;i*=5){
            System.out.println(i);
        }
    }
}
