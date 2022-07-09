//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double mesafe,yas,select,normalTutar,toplamTutar;
        Scanner scn=new Scanner(System.in);

        System.out.print("Mesafeyi Km Turunden Giriniz: ");
        mesafe=scn.nextDouble();
        System.out.print("Yasinizi Giriniz: ");
        yas=scn.nextDouble();
        System.out.println("1- Tek Yon\n2- Gidis Donus");
        System.out.print("Yolculuk Tipini Seciniz: ");
        select=scn.nextDouble();

        if (mesafe<=0){
            System.out.println("Hatali Veri Girdiniz!");
        } else if (yas<=0){
            System.out.println("Hatali Veri Girdiniz!");
        } else if (select!=1&&select!=2){
            System.out.println("Hatali Veri Girdiniz!");
        }


        normalTutar=mesafe*0.1;

       if (yas<12){
            toplamTutar=(normalTutar-(normalTutar*0.5));
            if (select==2){
                toplamTutar=(toplamTutar-(toplamTutar*0.2))*2;
                System.out.println("Toplam Tutar: " +toplamTutar+" TL");
            }    else if (select==1){
                    System.out.println("Toplam Tutar: "+toplamTutar+" TL");
                }

        } else if (yas>=12&&yas<24){
            toplamTutar=(normalTutar-(normalTutar*0.1));
            if (select==2){
                toplamTutar=(toplamTutar-(toplamTutar*0.2))*2;
                System.out.println("Toplam Tutar: "+toplamTutar+" TL");
            }    else if (select==1){
                    System.out.println("Toplam Tutar: "+toplamTutar+ " TL");
                }

        } else if (yas>65){
            toplamTutar=(normalTutar-(normalTutar*0.3));
            if (select==2){
                toplamTutar=(toplamTutar-(toplamTutar*0.2))*2;
                System.out.println("Toplam Tutar: "+toplamTutar+" TL");
            }    else if(select==1){
                    System.out.println("Toplam Tutar: "+toplamTutar+ " TL");
                }

        } else {
            System.out.println("Toplam Tutar: "+normalTutar+" TL");
        }
    }
}
