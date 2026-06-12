package hw;

public class trappingWater {

    public static void trapedWater(int height[]) {
        int n = height.length;
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trapedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapedWater += waterLevel - height[i];
        }
        System.out.println(trapedWater);

    }

    public static void main(String[] args) {
        int height[] = { 2, 5, 3, 8, 4, 2, 7 };
        trapedWater(height);
    }
}