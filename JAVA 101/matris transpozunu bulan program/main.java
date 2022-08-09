//www.patika.dev

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.print("Matrisin Satir Sayisini Giriniz: ");
        int satir=scn.nextInt();
        System.out.print("Matrisin Sutun Sayisini Giriniz: ");
        int sutun=scn.nextInt();
        System.out.println("Matrisin Elemanlarini Yaziniz: ");

        int [][]matris=new int[satir][sutun];

        for (int i=0; i< matris.length; i++){
            for (int j=0; j< matris[i].length; j++){
                matris[i][j]= scn.nextInt();
            }
        }

        System.out.println("Matris: ");
        for (int i=0; i<matris.length; i++){
            for (int j=0; j<matris[i].length; j++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpozu: ");
        for (int i=0; i<matris[0].length; i++){
            for (int j=0; j< matris.length; j++){
                System.out.print(matris[j][i]+" ");
            }
            System.out.println();
        }
    }
}
