public class copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "soham";
        s1.rollNo = 129;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 40;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 90;

        // s2
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

        // s1

        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]); 
        }

    }
}

class Student {
    String name;
    int rollNo;
    String password;
    int marks[];

    // shallow copy constructor
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.rollNo = s1.rollNo;
    // this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
    }

}
