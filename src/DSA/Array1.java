package DSA;
import java.lang.Math;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for(int i=0;i< array.length;i++){
            array[i]=(int)(Math.random()*10);
        }

        /*for (int a:array)
        {
            System.out.println(a);
        }*/
        System.out.println(Arrays.toString(array));
    }
}
