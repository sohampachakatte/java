public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();

    }
}

interface herbivorous {

    void eat();

}  

interface carnivorous {
    void eat();

}

class Bear implements herbivorous, carnivorous {
    public void eat() {
        System.out.println("Bear eats both meat and grass");
    }
}