package ArrayList;

import java.util.ArrayList;

public class OpCw {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int left = 0;
        int right = list.size() - 1;
        int maxWater = 0;
        while (left < right) {

            int height = Math.min(list.get(left), list.get(right));
            int width = right - left;
            int currentwater = height * width;

            maxWater = Math.max(maxWater, currentwater);

            if (list.get(left) < list.get(right)) {
                left++;
            } else {
                right--;
            }

        }
        System.out.println(maxWater);
    }
}
