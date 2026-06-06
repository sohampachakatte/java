package PractiseQuestions;

public class problem2 {

    public static void main(String[] args) {
        vehicle obj1 = new car();
        obj1.print();

        vehicle obj2 = new vehicle();
        obj2.print();
    }

}

class vehicle {
    void print() {
        System.out.println("Base class (vehicle)");
    }
}

class car extends vehicle {
    void print1() {
        System.out.println("Derived class (car)");
    }
}