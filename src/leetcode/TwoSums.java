package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {
    public static int[] twoSum(int[] nums, int target)
    {
        int n=nums.length;
        for(int i=0; i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
