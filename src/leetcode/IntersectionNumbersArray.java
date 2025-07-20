package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionNumbersArray {
    public static int[] intersect(int[]arr1, int[]arr2)
    {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;int j=0;
        while (i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j])
            {
                i++;
            } else if (arr1[i]>arr2[j]) {
                j++;
            }
            else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        int[] finalarr = new int[list.size()];
        for(int k=0;k<list.size();k++)
        {
            finalarr[k]=list.get(k);
        }
        return finalarr;


    }

    public static void main(String[] args) {
       int[] arr1={1,9,9,8,1};
       int[] arr2={4,6,2,1,8};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }
}
