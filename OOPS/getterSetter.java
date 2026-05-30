import java.util.*;

public class getterSetter {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("Blue");
        p1.setTip(2);
        System.out.println("Pen color : " + p1.getColor());
        System.out.println("Pen tip : " + p1.getTip());
        System.out.println("After Modified ");
        p1.setColor("Black");
        p1.setTip(3);
        System.out.println("Pen color : " + p1.getColor());
        System.out.println("Pen tip : " + p1.getTip());
    }
}

class pen {
    private String color;
    private int tip;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }

    int getTip() {
        return this.tip;
    }

}