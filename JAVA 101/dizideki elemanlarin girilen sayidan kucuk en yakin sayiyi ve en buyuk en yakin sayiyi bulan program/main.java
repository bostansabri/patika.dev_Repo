//www.patika.dev

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int [] arr= {15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi: "+Arrays.toString(arr));
        Arrays.sort(arr);

        Scanner scn=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        int number=scn.nextInt();

        int min=arr[0];
        int max=arr[0];

        for (int i:arr){
            if (i<number){
                min=i;
            }
            if (i>number){
                max=i;
                break;
            }
        }

        System.out.println("Girilen Sayidan Kucuk En Yakin Sayi: "+min);
        System.out.println("Girilen Sayidan Buyuk En Yakin Sayi: "+max);

    }
}
