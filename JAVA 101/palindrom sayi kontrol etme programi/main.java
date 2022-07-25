import java.util.Scanner;

public class main {

    static boolean isPalidrom(int number){

        int temp=number, reverseNumber=0, lastNumber;

        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if (number==reverseNumber){
            System.out.println("Sayi Palindrom Bir Sayidir!");
            return true;
        }else {
            System.out.println("Sayi Palindrom Bir Sayi Degildir!");
           return false;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int number;
        System.out.print("Bir Sayi Giriniz: ");
        number=scn.nextInt();

        System.out.println(isPalidrom(number));

    }
}
