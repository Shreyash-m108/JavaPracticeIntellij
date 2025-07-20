package DSA;

import java.util.Arrays;

public class maxElement {
    static int maxNumber(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    static int minNumber(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String[] args) {
        int[] arr={2,33,5,1,0};
        System.out.println(maxNumber(arr));
        System.out.println(minNumber(arr));
    }
}
