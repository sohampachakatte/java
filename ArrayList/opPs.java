package ArrayList;

import java.util.ArrayList;

public class opPs {

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if ((list.get(left) + list.get(right)) == target) {
                System.out.println("Pair = " + list.get(left) + "," + list.get(right));
                return true;
            }

            if (list.get(right) + list.get(left) > target) {
                right--;
            } else {
                left++;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;

        if (pairSum(list, target)) {
            System.out.println("Pairs Found");
        } else {
            System.out.println("Pairs Not found");
        }
    }
}
