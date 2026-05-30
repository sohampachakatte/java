public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("soham", 129);
        System.out.println("Name : " + s1.name);
        System.out.println("Roll no : " + s1.rollNo);
    }
}

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("constructor is called ");
    }
}