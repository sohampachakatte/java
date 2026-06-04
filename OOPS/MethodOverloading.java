public class MethodOverloading {
    public static void main(String[] args) {
        // polymorphism 


        calculator calc = new calculator();
        System.out.println(calc.sum((float) 2.8, (float) 2.8));
        System.out.println(calc.sum(3, 4));
        System.out.println(calc.sum((float) 3.5, (float) 3.5, (float) 3.5));

    }
}

class calculator {
    // function overloading ->compile time polymorphism  
    int sum(int a, int b) {
        return a + b;
    }
 
    float sum(float a, float b) {
        return a + b;
    }

    float sum(float a, float b, float c) {
        return a + b + c;
    }

}
