//www.patika.dev

import java.util.Scanner;

public class main {
    Scanner scn=new Scanner(System.in);

    static double sum(double a, double b){
        double result= a+b;
        return result;
    }

    static double min(double a, double b){
        double result= a-b;
        return result;
    }

    static double mult(double a, double b){
        double result= a*b;
        return result;
    }

    static double div(double a, double b){
        double result= a/b;
        return result;
    }
    static double power(double a, double b){
        double result=1;
        for (double i=1; i<=b; i++){
            result*=a;
        }
        return result;
    }
    static int fact(int a){
        int result=1;
        for (int i=1; i<=a; i++){
            result*=i;
        }
        return result;
    }
    static int mod(int a, int b){
        int result=a%b;
        return result;
    }
    static double rectanArea(double a, double b){
        double result=a*b;
        return result;
    }
    static double rectanEnvir(double a, double b){
        double result=(a+b)*2;
        return result;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int select;

       do {

           String menu= "1- Toplama Islemi.\n2- Cikarma Islemi\n3- Carpma Islemi\n4- Bolme Islemi\n" +
                   "5- Uslu Sayi Yapma\n6- Faktoriyel Hesaplama\n7- Mod Alma\n8- Dikdortgen Alan ve Cevre Hesabi\n0- Cikis!";
           System.out.println(menu);
           System.out.print("Bir Islem Seciniz: ");
           select=scn.nextInt();

        if (select==1){
            System.out.print("Birinci Sayiyi Giriniz: ");
            double a=scn.nextDouble();
            System.out.print("Ikinci Sayiyi Giriniz: ");
            double b=scn.nextDouble();
            System.out.println("Sonuc: "+sum(a,b));
        }
        else if(select==2){
            System.out.print("Birinci Sayiyi Giriniz: ");
            double a=scn.nextDouble();
            System.out.print("Ikinci Sayiyi Giriniz: ");
            double b=scn.nextDouble();
            System.out.println("Sonuc: "+min(a,b));
        }
        else if(select==3){
            System.out.print("Birinci Sayiyi Giriniz: ");
            double a=scn.nextDouble();
            System.out.print("Ikinci Sayiyi Giriniz: ");
            double b=scn.nextDouble();
            System.out.println("Sonuc: "+mult(a,b));
        }
        else if(select==4){
            System.out.print("Birinci Sayiyi Giriniz: ");
            double a=scn.nextDouble();
            System.out.print("Ikinci Sayiyi Giriniz: ");
            double b=scn.nextDouble();
            System.out.println("Sonuc: "+div(a,b));
        }
        else if(select==5){
            System.out.print("Taban Sayisini Giriniz: ");
            double a=scn.nextDouble();
            System.out.print("Ussunu Giriniz: ");
            double b=scn.nextDouble();
            System.out.println("Sonuc: "+power(a,b));
        }
        else if(select==6){
            System.out.print("Bir Sayi Giriniz: ");
            int a=scn.nextInt();
            System.out.println("Sonuc: "+fact(a));
        }
        else if(select==7){
            System.out.print("Birinci Sayiyi Giriniz: ");
            int a=scn.nextInt();
            System.out.print("Ikinci Sayiyi Giriniz: ");
            int b=scn.nextInt();
            System.out.println("Sonuc: "+mod(a,b));
        }
        else if(select==8){
            System.out.print("Kisa Kenari Giriniz: ");
            double a=scn.nextInt();
            System.out.print("Uzun Kenari Giriniz: ");
            double b=scn.nextInt();
            System.out.println("Dikdortgenin Alani: "+rectanArea(a,b));
            System.out.println("Dikdortgenin Cevresi: "+rectanEnvir(a,b));
        }
        else if(select<0 || select> 8){
            System.out.println("Yanlis Bir Secim Yaptiniz, Tekrar Deneyin.");
        }
        else if(select==0){
            System.out.println("Gule GUle.");
            break;
        }
        } while (select!=0);
    }
}
