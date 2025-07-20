package leetcode;

public class findingMissingNumberArray {
    public static int missingNumber(int[] arr) {
        int n = arr.length + 1; // Size of the original array
        int totalXOR = 0; // XOR of all numbers from 1 to n
        // Calculate XOR of all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            totalXOR ^= i;
        }
        // Calculate XOR of all elements in the given array
        int arrayXOR = 0;
        for (int num : arr) {
            arrayXOR ^= num;
        }

        // The missing number is the XOR of totalXOR and arrayXOR
        return totalXOR ^ arrayXOR;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int missingNumber = missingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }
}

