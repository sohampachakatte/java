public class Abstraction {
    public static void main(String[] args) {

        horse h = new horse();
        h.eat();
        h.walk();
        h.changeColor();
        System.out.println(h.color);

        chicken c = new chicken();
        c.eat();
        c.walk();
        c.changeColor();
        System.out.println(c.color);

        // animal a = new animal() -> ERROR

    }
}

abstract class animal {
    String color;

    animal() {
        color = "Brown";

        System.out.println("Animal constructor");
    }

    void eat() {
        System.out.println("animlas eats");

    }

    abstract void walk();
}

class horse extends animal {
    horse() {
        System.out.println("Horse constructor");
    }

    void changeColor() {
        color = "DarkBrown";
    }

    void walk() {
        System.out.println("Walks on four legs");
    }
}

class chicken extends animal {

    chicken() {
        System.out.println("chicken constructor");
    }

    void changeColor() {
        color = "Yellow";
    }

    void walk() {
        System.out.println("walks on two legs");
    }
}
