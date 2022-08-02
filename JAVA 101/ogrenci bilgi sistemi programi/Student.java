public class Student {

    String name;
    String stuNo;
    String classes;
    Course mat;
    Course fiz;
    Course kim;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course mat, Course fiz, Course kim){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.mat=mat;
        this.fiz=fiz;
        this.kim=kim;
        calcAvarage();
        this.isPass=false;
    }

    public void addBulkExamNote(double mat, double fiz, double kim, double sozNote){
        if (mat>=0&&mat<=100&&sozNote>=0&&sozNote<=100){
            this.mat.note=(mat*0.80)+(sozNote*0.20);
        }
        if (fiz>=0&&fiz<=100&&sozNote>=0&&sozNote<=100){
            this.fiz.note=(fiz*0.80)+(sozNote*0.20);
        }
        if (kim>=0&&kim<=100&&sozNote>=0&&sozNote<=100){
            this.kim.note=(kim*0.80)+(sozNote*0.20);
        }
    }

    public void isPass(){
        if (this.mat.note==0||this.fiz.note==0||this.kim.note==0){
            System.out.println("Notlar tam olarak girilmemis!");
        }else {
            this.isPass=isCheckPass();
            printNote();
            System.out.println("Ortalama : " +"\t\t\t"+ this.avarage);
            if (this.isPass){
                System.out.println("Sinifi Gecti. ");
            }else{
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAvarage(){
        this.avarage = (this.fiz.note+ this.kim.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci : "+ this.name);
        System.out.println("Matematik Notu : "+"\t" + this.mat.note);
        System.out.println("Fizik Notu : " + "\t\t"+this.fiz.note);
        System.out.println("Kimya Notu : " + "\t\t"+this.kim.note);
    }
}
