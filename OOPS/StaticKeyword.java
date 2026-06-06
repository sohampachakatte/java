public class StaticKeyword {
    public static void main(String[] args) {

        student s1 = new student();
        s1.SchoolName = "SHV";

        student s2 = new student();
        System.out.println(s2.SchoolName);

    }
}

class student {
    String name;
    int rollNo;

    static String SchoolName;

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }
}
