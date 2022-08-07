//www.patika.dev

import java.util.Arrays;

public class main {
    static boolean isMod(int[]arr, int value){
        for (int i:arr){
            if(i%2==0&&i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int [] arr={2,3,4,8,7,6,2,8,4,9};
        int [] newArr=new int [arr.length];
        int a=0;

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(i!=j&&arr[i]==arr[j]){
                    if(!isMod((newArr), arr[i])){
                        newArr[a++]=arr[i];
                    }
                    break;
                }
            }
        }

        for (int value:newArr){
            if(value!=0){
                System.out.print(value+" ");
            }
        }
    }
}
