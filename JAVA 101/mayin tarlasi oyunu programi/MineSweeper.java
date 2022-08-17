import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {

    int satirSayisi;
    int sutunSayisi;
    int elemanSayisi;
    int mayinSayisi;

    MineSweeper(int satirSayisi, int sutunSayisi){
        this.satirSayisi=satirSayisi;
        this.sutunSayisi=sutunSayisi;
        this.elemanSayisi=satirSayisi*sutunSayisi;
        this.mayinSayisi=elemanSayisi/4;
    }

    char oyunAlani[][];
    String sayiAlani[][];

    public void oyunAlani(int satirSayisi, int sutunSayisi){
        oyunAlani=new char[satirSayisi][sutunSayisi];
        sayiAlani=new String[satirSayisi][sutunSayisi];

        for (int i=0;i<satirSayisi;i++){
            for (int j=0;j<sutunSayisi;j++){
                oyunAlani[i][j]='-';
                sayiAlani[i][j]="-";
            }
        }
    }

    public void mayinSayisi(int satirSayisi, int sutunSayisi){

        for (int i=0; i<this.mayinSayisi;i++){

            int randoma=(int)(Math.random()*this.satirSayisi);
            int randomb=(int)(Math.random()*this.sutunSayisi);
            if (oyunAlani[randoma][randomb]=='*'){
                mayinSayisi++;
            }else {
                oyunAlani[randoma][randomb]='*';
            }
        }
    }

    public void mayinKonumu(int satirSayisi, int sutunSayisi){
        for (int i=0;i<this.satirSayisi;i++){
            for (int j=0;j<this.sutunSayisi;j++){
                System.out.print(oyunAlani[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }

    public void run(){
        Scanner scn=new Scanner(System.in);

        System.out.println("MAYIN TARLASINA HOSGELDINIZ");

        oyunAlani(this.satirSayisi,this.sutunSayisi);
        mayinSayisi(this.satirSayisi,this.sutunSayisi);
        mayinKonumu(this.satirSayisi,this.sutunSayisi);

        int boyut=this.satirSayisi*this.sutunSayisi;
        int ma=boyut-boyut/4;

        while (ma>0){
            for (int i=0;i<this.satirSayisi;i++){
                for (int j=0;j<this.sutunSayisi;j++){
                    System.out.print(sayiAlani[i][j]+" ");
                }
                System.out.println();
            }

            int toplam=0;

            System.out.print("Satir Giriniz: ");
            int satir=scn.nextInt()-1;
            System.out.print("Sutun Sutun: ");
            int sutun=scn.nextInt()-1;

            if (satir<=this.satirSayisi&&sutun<=this.sutunSayisi&&satir>=0){
                if (oyunAlani[satir][sutun]=='*'){
                    System.out.println("Kaybettiniz!");
                    break;
                } else {
                    if (satir-1>=0&&sutun-1>=0){
                        if (oyunAlani[satir-1][sutun-1]=='*'){
                            toplam++;
                        }
                    }
                    if (satir-1>=0){
                        if (oyunAlani[satir-1][sutun]=='*'){
                            toplam++;
                        }
                    }
                    if (satir-1>=0&&sutun+1<this.sutunSayisi){
                        if (oyunAlani[satir-1][sutun+1]=='*'){
                            toplam++;
                        }
                    }
                    if (sutun-1>=0){
                        if (oyunAlani[satir][sutun-1]=='*'){
                            toplam++;
                        }
                    }
                    if (sutun+1<this.sutunSayisi){
                        if (oyunAlani[satir][sutun+1]=='*'){
                            toplam++;
                        }
                    }
                    if (sutun+1<satir&&sutun-1>=0){
                        if (oyunAlani[satir+1][sutun-1]=='*'){
                            toplam++;
                        }
                    }
                    if (satir+1<this.satirSayisi){
                        if (oyunAlani[satir+1][sutun]=='*'){
                            toplam++;
                        }
                    }
                    if (satir+1<this.satirSayisi&&sutun+1<this.sutunSayisi){
                        if (oyunAlani[satir+1][sutun+1]=='*'){
                            toplam++;
                        }
                    }

                    sayiAlani[satir][sutun] = String.valueOf(toplam);
                }
            }else {
                System.out.println("Gecersiz Sayi Girdiniz!");
            }
            System.out.println("=============");
            ma--;

            if (ma==0){
                System.out.println("TEBRIKLER KAZANDINIZ!");

                for (int i=0;i<this.satirSayisi;i++){
                    for (int j=0;j<this.sutunSayisi;j++){
                        System.out.print(sayiAlani[i][j]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
