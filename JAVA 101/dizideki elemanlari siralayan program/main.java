//www.patika.dev

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.print("Dizinin Boyutunu Giriniz n: ");
        int n=scn.nextInt();
        System.out.println("Dizinin Elemanlarini Giriniz: ");

        int [] arr=new int[n];
        int eleman;

        for (int i=0;i<n;i++){
            eleman=i;
            System.out.print(++eleman+". Eleman: ");
            eleman=scn.nextInt();
            arr[i]=eleman;
        }

        Arrays.sort(arr);
        System.out.println("Siralama: "+Arrays.toString(arr));
    }
}
