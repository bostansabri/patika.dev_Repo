import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double mat, fiz, turk, kim, muz, ort;
        Scanner scn = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = scn.nextDouble();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fiz = scn.nextDouble();
        System.out.print("Turkce Notunuzu Giriniz: ");
        turk = scn.nextDouble();
        System.out.print("Kimya Notunuzu Giriniz: ");
        kim = scn.nextDouble();
        System.out.print("Muzik Notunuzu Giriniz: ");
        muz = scn.nextDouble();

        if (mat<0||mat>100) {
            mat=0;
        }
        if (fiz<0||fiz>100) {
            fiz=0;
        }
        if (turk<0||turk>100) {
            turk=0;
        }
        if (kim<0||kim>100) {
            kim=0;
        }
        if (muz<0||muz>100) {
            muz=0;
        }

        ort=(mat+fiz+turk+kim+muz)/5;

        System.out.println("Ortalama Notunuz: "+ort);
        if (ort>=55) {
            System.out.println("Tebrikler! Sinifi Gectiniz");
        } else {
            System.out.println("Sinifta Kaldiniz.");
        }

    }
}
