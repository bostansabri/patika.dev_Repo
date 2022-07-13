//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int sayiAdeti,sayi,max=1,min=1;

        System.out.print("Kac tane sayi gireceksiniz: ");
        sayiAdeti=scn.nextInt();

        for (int i=1;i<=sayiAdeti;i++){
            System.out.print(i+". Sayiyi Giriniz: ");
            sayi=scn.nextInt();

            if(i==1){
                min=sayi;
                max=sayi;
            } else if(sayi>max){
                max=sayi;
            } else if(sayi<min){
                min=sayi;
            }
        }
        System.out.println("En buyuk sayi: "+max);
        System.out.println("En kucuk sayi: "+min);
    }
}
