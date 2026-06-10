package ArrayList;

import java.util.*;

public class program2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.size());
        // print arraylist

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        
    }
}
