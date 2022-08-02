//www.patika.dev

public class main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fiz = new Course("Fizik", "FZK101", "FZK");
        Course kim = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayse", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fiz.addTeacher(t2);
        kim.addTeacher(t3);

        Student s1 = new Student("Inek Saban", "4", "140144015", mat, fiz, kim);
        s1.addBulkExamNote(50,20,40,90);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi", "4", "2211133", mat, fiz, kim);
        s2.addBulkExamNote(100,50,40,80);
        s2.isPass();

        Student s3 = new Student("Hayta Ismail", "4", "221121312", mat, fiz, kim);
        s3.addBulkExamNote(50,20,40,70);
        s3.isPass();

    }
}
