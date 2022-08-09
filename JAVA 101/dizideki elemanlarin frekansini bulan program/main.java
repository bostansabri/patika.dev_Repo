//www.patika.dev

import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.print("Dizinin Boyutunu Giriniz: ");
        int boyut=scn.nextInt();
        System.out.println("Dizi Elemanlarini Giriniz: ");

        int []arr=new int[boyut];
        int []newArr=new int[arr.length];

        for (int i=0; i<boyut; i++){
            int eleman=scn.nextInt();
            arr[i]=eleman;
        }

        System.out.println("Dizi: "+Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            newArr[i]=1;
            for(int j=i+1; j<arr.length; j++){
                if( (arr[i]==arr[j])){
                    newArr[i]++;
                }
            }
        }

        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if ((arr[i]==arr[j])) {
                    arr[j]=0;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            if(newArr[i]>1){
                if(arr[i]!=0){
                    System.out.println(arr[i]+ " sayisi "+ newArr[i]+" kere tekrar edildi.");
                }
            }else if(newArr[i]==1){
                if(arr[i]!=0){
                    System.out.println(arr[i]+ " sayisi "+ newArr[i]+" kere tekrar edildi.");
                }
            }
        }
    }
}
