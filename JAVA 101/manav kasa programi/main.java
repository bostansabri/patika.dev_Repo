//www.patika.dev

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican, toplamTutar;

        Scanner std=new Scanner(System.in);

        System.out.print("Armut Kac Kilo?: ");
        armut=std.nextDouble();
        System.out.print("Elma Kac Kilo?: ");
        elma=std.nextDouble();
        System.out.print("Domates Kac Kilo?: ");
        domates=std.nextDouble();
        System.out.print("Muz Kac Kilo?: ");
        muz=std.nextDouble();
        System.out.print("Patlican Kac Kilo?: ");
        patlican=std.nextDouble();

        armut=armut*2.14;
        elma=elma*3.67;
        domates=domates*1.11;
        muz=muz*0.95;
        patlican=patlican*5.0;

        toplamTutar=armut+elma+domates+muz+patlican;
        System.out.print("Toplam Tutar:"+toplamTutar+"TL");


    }
}
