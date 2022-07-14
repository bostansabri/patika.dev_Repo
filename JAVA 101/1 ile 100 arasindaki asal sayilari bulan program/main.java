//www.patika.dev

public class main {
    public static void main(String[] args) {

        for (int i=1; i<=100; i++){
            int sayac=0;
                for (int a=1;a<=i;a++){
                    if (i%a==0){
                        sayac++;
                    }
                }
            if (sayac==2) {
                System.out.print(i + " ");
            }
        }
    }
}
