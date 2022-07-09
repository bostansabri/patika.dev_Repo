//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int dogumYili;
        Scanner scn=new Scanner(System.in);

        System.out.print("Dogum Yilinizi Giriniz: ");
        dogumYili=scn.nextInt();

        if (dogumYili%12==0){
            System.out.println("Cin Zodyagi Burcunuz : Maymun");
        }
        if (dogumYili%12==1){
            System.out.println("Cin Zodyagi Burcunuz : Horoz");
        }
        if (dogumYili%12==2){
            System.out.println("Cin Zodyagi Burcunuz : Kopek");
        }
        if (dogumYili%12==3){
            System.out.println("Cin Zodyagi Burcunuz : Domuz");
        }
        if (dogumYili%12==4){
            System.out.println("Cin Zodyagi Burcunuz : Fare");
        }
        if (dogumYili%12==5){
            System.out.println("Cin Zodyagi Burcunuz : Okuz");
        }
        if (dogumYili%12==6){
            System.out.println("Cin Zodyagi Burcunuz : Kaplan");
        }
        if (dogumYili%12==7){
            System.out.println("Cin Zodyagi Burcunuz : Tavsan");
        }
        if (dogumYili%12==8){
            System.out.print("Cin Zodyagi Burcunuz : Ejderha");
        }
        if (dogumYili%12==9){
            System.out.print("Cin Zodyagi Burcunuz : Yilan");
        }
        if (dogumYili%12==10){
            System.out.print("Cin Zodyagi Burcunuz : At");
        }
        if (dogumYili%12==11){
            System.out.print("Cin Zodyagi Burcunuz : Koyun");
        }

    }
}
