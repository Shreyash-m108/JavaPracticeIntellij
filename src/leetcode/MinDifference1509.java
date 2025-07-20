package leetcode;

import java.util.Arrays;

public class MinDifference1509 {
    static int minDifference(int[] arr){
        if(arr.length<=4){
            return 0;
        }
        Arrays.sort(arr);
        int length = arr.length;
        int result = Integer.MAX_VALUE;
        result =Math.min(result,arr[length-4]-arr[0]);
        result =Math.min(result,arr[length-3]-arr[1]);
        result =Math.min(result,arr[length-2]-arr[2]);
        result =Math.min(result,arr[length-1]-arr[3]);
        return result;

    }
    public static void main(String[] args) {
        int[] arr={5,3,2,4};
        System.out.println(minDifference(arr));
    }
}
