package ArrayList;

import java.util.*;

public class sortArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of ArrayList : ");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        System.out.print("Enter Arraylist Element : ");
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            list.add(element);
        }

        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);

        sc.close();
    }
}
