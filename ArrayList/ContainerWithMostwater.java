package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostwater {
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

        if (list == null || list.size() < 2) {
            System.out.println("Invalid input: need at least 2 heights");
            return;
        }


        for (int height : list) {
            if (height < 0) {
                System.out.println("Invalid: heights must be non-negative");
                return;
            }
        } 
        int height = 0, width = 0;
        int maxWater = 0, area = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                height = Math.min(list.get(i), list.get(j)); 
                width = j - i;
                area = height * width;
                maxWater = Math.max(maxWater, area);
            }
        }

        System.out.println("Container with most water is water : " + maxWater);
    }
}
