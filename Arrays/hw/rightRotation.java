package hw;

import java.util.*;

public class rightRotation {
    static Scanner sc = new Scanner(System.in);

    public static void reverse(int arr[], int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotateArray(int arr[]) {
        int n = arr.length;
        System.out.print("Enter position to rotate : ");
        int k = sc.nextInt();
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        // reverse(arr, 0, k - 1);
        // reverse(arr, k, n - 1);
        // reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {

        int arr[] = { 6,8,9,10,11,15 };
        rotateArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
