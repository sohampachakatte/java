public class MethodOverriding {
    public static void main(String[] args) {
        deer d1 = new deer();
        d1.eat();

    }
}

class animal {
    void eat() {
        System.out.println("Eat anything");
    }
}

class deer extends animal {
    void eat() {
        System.out.println("Eat grass");
    }
}
