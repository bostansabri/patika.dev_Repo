//www.patika.dev

import java.util.Scanner;

public class main {

    static boolean isPalindrom(String str){
        int i=0;
        int j= str.length()-1;

        while (i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Lutfen Test Etmek Istediginiz Kelimeyi Yaziniz: ");
        String a=scn.nextLine();

        if (isPalindrom(a)==true){
            System.out.println("'"+a+"'"+ " Palindrom Bir Kelimedir.");
        }else {
            System.out.println("'"+a+"'"+ " Palindrom Bir Kelime Degildir!");
        }
    }
}
