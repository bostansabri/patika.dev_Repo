//www.patika.dev

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Random rand= new Random();
        int number= rand.nextInt(100);
        System.out.println(number);

        Scanner scn= new Scanner(System.in);
        System.out.print("Luten Tahmininizi 0 ile 100 Arasinda Giriniz: ");

        boolean isWrong=false;
        boolean isWin=false;
        int []wrong=new int[5];

        int life=0;
        while (life<5){
            int enter= scn.nextInt();

            if (enter<=0 || enter>=100){
                System.out.print("Yanlis Giris Yaptiniz, Tekrar Deneyeyin. ");
                if (isWrong){
                    life++;
                    System.out.println("Cok Fazla Hatali Giris Yaptiniz. Kalan Hakkiniz: "+ (5-life));
                }
                else {
                    isWrong=true;
                    System.out.println("(Not: Bir Daha Hatali Giris Yapmaniz Durumunda Hakkinizdan Dusulecektir!)");
                }
                continue;
            }
            else {
                if (enter==number){
                    System.out.println("Tekbrikler Tahmininiz Dogru, KAZANDINIZ!");
                    isWin=true;
                    break;
                }
                if (life==4){
                    System.out.println("Tahmin Hakkiniz Kalmadi, KAYBETTINIZ!");
                    break;
                }
                if (enter!=number){
                    life++;
                    System.out.print("Tahmininiz Yanlis, Kalan Hakkiniz: "+ (5-life)+ " |" + " Tekrar Deneyiniz: ");
                    if (enter<number){
                        System.out.println(enter+ " Sayisi Gizli Sayidan Kucuk.");
                    }
                    else {
                        System.out.println(enter+ " Sayisi Gizli Sayidan Buyuk.");
                    }
                }
            }
        }
        if (!isWin){
            if(isWrong){
                System.out.println("Tahminleriniz: "+ Arrays.toString(wrong));
            }
        }
    }
}
