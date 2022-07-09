//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner std=new Scanner(System.in);

        double r, a, dilimAlani, pi=3.14;

        System.out.print("Lutfen Yaricapi Giriniz: ");
        r= std.nextDouble();

        System.out.print("Lutfen Merkez Acisinin Olcusunu Giriniz: ");
        a=std.nextDouble();


        dilimAlani=(pi*(r*r)*a)/360;
        System.out.print("Daire Diliminin Alani: "+dilimAlani);


    }
}
