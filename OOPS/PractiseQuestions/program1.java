package PractiseQuestions;

public class program1 {
    public static void main(String[] args) {
        student s = new student();
        s.setName("Soham pachakatte");
        System.out.println("Name of student is  : " + s.getName());

    }
}

class student {
    String name;
    int marks;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
