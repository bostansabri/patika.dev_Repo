//www.patika.dev

public class main {
    public static void main(String[] args) {

        double [] arr={1,2,3,4,5};
        double sum=0.0;
        int mult=1;

        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        for (int i=0; i<arr.length; i++){
            mult*=arr[i];
        }

        double harAvarage= (arr.length*mult)/sum;
        System.out.println(harAvarage);

    }
}
