package ArrayList.hw;

public class monotonicArr {
    public static boolean monotonicArray(int arr[]) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                increasing = false;
            }
            if (arr[i] < arr[i + 1]) {
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3 };
        if (monotonicArray(arr)) {
            System.out.println("Give array is Monotonic array");
        }

    }
}
