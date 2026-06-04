public class hierarchical {
    public static void main(String[] args) {
        fish f1 = new fish();
        f1.breathe();
        f1.eat();
        f1.swim();

        mammels m1 = new mammels();

        m1.eat();
        m1.breathe();
        m1.walk();
    }

}

class Animal {

    String color;

    Animal() {
        System.out.println("Animal con");
    }

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }

}

class mammels extends Animal {
    int legs;

    mammels() {
        System.out.println("mammels con");
    }

    void walk() {
        System.out.println("walk");
    }
}

class fish extends Animal {

    fish() {
        System.out.println("fish con");
    }

    void swim() {
        System.out.println("Swim");
    }
}
