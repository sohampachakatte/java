package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class program1 {
    // java collection frameWork;
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // getoperation
        int element = list.get(0);
        System.out.println(element);

        // remove element
        list.remove(2);
        System.out.println(list);

        // set value
        list.set(1, 9);
        System.out.println(list);

        // contains element

        System.out.println(list.contains(4));

        // How to access -> use get() function

    }
}
