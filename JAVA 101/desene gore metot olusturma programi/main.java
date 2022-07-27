//www.patika.dev

import java.util.Scanner;

public class main {

    static int min(int a){
        if(a<=0){
            return a;
        }else{
            System.out.print(a+" ");
            return min(a-5);
        }
    }

    static int sum(int a, int b){
        if(a>b){
            return a;
        }else{
            System.out.print(a+" ");
            return sum(a+5,b);
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("N Sayisini Giriniz: ");
        int a=scn.nextInt();

        sum(min(a),a);
    }
}
