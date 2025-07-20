package DSA;

public class BinaryUsingRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,43,67,76,78,98,111};
        int target =111;
        System.out.println(Search(arr,target,0,arr.length-1));
    }
    static int Search(int[] arr , int value , int start , int end){
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid]==value){
            return mid;
        }
        if(value<arr[mid]){
            return Search(arr,value,start,mid-1);
        }
        return Search(arr,value,mid+1,end);
    }
}
