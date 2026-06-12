package ArrayList;

import java.util.*;

public class Multidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        System.out.println("Enter array element : ");

        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                int item = sc.nextInt();
                list.add(item);
            }
            mainList.add(list);
        }

        // printm 2d arrayList element ;

        for (ArrayList<Integer> row : mainList) {
            System.out.println(row);
        }
    }
}