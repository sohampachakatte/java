package ArrayList.hw;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class lonelyNumber {
    public static void alone(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            int rightAdjacent = current + 1;
            int leftAdjacent = current - 1;
            boolean hasAdjacent = false;

            for (int j = 0; j < list.size(); j++) {
                if (leftAdjacent == list.get(j) || rightAdjacent == list.get(j)) {
                    hasAdjacent = true;
                    break;
                }
            }

            if (!hasAdjacent) {
                list2.add(current);
            }
        }
        System.out.println(list2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        alone(list);
    }
}
