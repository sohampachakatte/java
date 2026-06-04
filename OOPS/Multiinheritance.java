public class Multiinheritance {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.eat();
        d1.breathe();
        d1.walk();
        d1.breed = "rotwiller";
        System.out.println(d1.breed);

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

class dog extends mammels {
    String breed;

    dog() {
        System.out.println("dog con");
    }
}
