//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double d;       //Üçgenin Alanı
        double u;       //Üçgenin Çevresi

        Scanner std=new Scanner(System.in);

        System.out.print("1.Kenari Giriniz: ");
        a=std.nextDouble();

        System.out.print("2.Kenari Giriniz: ");
        b=std.nextDouble();

        System.out.print("3.Kenari Giriniz: ");
        c=std.nextDouble();


        u=((a+b+c)/2);

        d=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Ucgenin Alani: "+d);


        }
    }
