public class SingleInheritance {
    public static void main(String[] args) {

        fish shark = new fish();
        shark.eat();
        shark.breath();
        shark.swim();
        shark.fins = 4;
        System.out.println(shark.fins);

    }
}

// base class
class Animal {
    // property
    String color;

    // methods
    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breathes");
    }
}

// derived class
class fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}
