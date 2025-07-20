package DSA;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        for (int i=1 ; i<arr.length ; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j>=0 &&key<arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] =key;
        }
        System.out.print("Sorted Array is :");
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        }

    public static void main(String[] args) {
        int[] arr = {11,3,7,1,4};

        insertionSort(arr);
    }
}
