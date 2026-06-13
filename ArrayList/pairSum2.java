package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import hw.rightRotation;

public class pairSum2 {
    public static boolean pairSum(ArrayList<Integer> list, int i, int target) {
        int left = i + 1;
        int right = i;
        int n = list.size();

        while (left != right) {
            if (list.get(left) + list.get(right) == target) {
                System.out.println("pair are : " + list.get(left) + ", " + list.get(right));
                return true;
            }

            if (list.get(left) + list.get(right) > target) {
                right = (n + right - 1) % n;
            } else {
                left = (left + 1) % n;
            }

        }
        return false;
    }

    public static int findPivot(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {

                return i;
                
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target : ");
        int target = sc.nextInt();
        int pivot = findPivot(list);
        System.out.println(pivot);
        if (pairSum(list, pivot, target)) {
            System.out.println("Pair found");
        } else {
            System.out.println("Pair not found");
        }
    }
}
