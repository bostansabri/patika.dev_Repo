public class Course {

    Teacher Teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sozNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note= 0.0;
        this.sozNote=0.0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.Teacher = t;
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (Teacher != null) {
            System.out.println(this.name + " Dersinin Akademisyeni : " + Teacher.name);
        } else {
            System.out.println(this.name + " Dersine Akademisyen Atanmamistir.");
        }
    }

}
