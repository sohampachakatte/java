package ArrayList.hw;

import java.util.ArrayList;

public class mostFrequent {

    public static void mostfrequent(ArrayList<Integer> list, int key) {
        int element = 0;
        for (int i = 0; i < list.size(); i++) {
            ;
            int current = list.get(i);
            int count = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (current == list.get(j)) {
                    count++;

                }
            }
            if (count == key) {
                element = current;
            }
        }
        System.out.println(element);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(8);
        list.add(100);
        int key = 1;
        mostfrequent(list, key);

    }
}
