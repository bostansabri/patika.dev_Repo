//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int sicaklik;
        Scanner scn=new Scanner(System.in);

        System.out.print("Hava Sicakligini Giriniz: ");
        sicaklik=scn.nextInt();

        if (sicaklik<=5){
            System.out.print("Kayak Yapabilirsiniz.");
        }else if (sicaklik>5&&sicaklik<=15) {
            System.out.print("Sinemaya Gidebilirsiniz.");
        }else if (sicaklik>15&&sicaklik<=25){
            System.out.print("Piknik Yapabilirsiniz.");
        }else if (sicaklik>25){
            System.out.print("Yuzmeye Gidebilirsiniz.");
        }
    }
}
