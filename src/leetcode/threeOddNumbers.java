package leetcode;

public class threeOddNumbers {
    public static boolean hasThreeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            // Check if arr[i], arr[i+1], and arr[i+2] are odd
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true; // Found three consecutive odd numbers
            }
        }
        return false; // No three consecutive odd numbers found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6}; // Example array
        if (hasThreeConsecutiveOdds(arr)) {
            System.out.println("The array has three consecutive odd numbers.");
        } else {
            System.out.println("The array does not have three consecutive odd numbers.");
        }
    }
}
