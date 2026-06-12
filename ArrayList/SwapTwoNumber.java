package ArrayList;

import java.util.ArrayList;

public class SwapTwoNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(90);
        list.add(89);
        list.add(80);
        System.out.println(list);

        System.out.println("Swap index 0 with 1");

        int temp = list.get(0);
        list.set(0, list.get(1));
        list.set(1, temp);
        System.out.println(list);

    }
}
