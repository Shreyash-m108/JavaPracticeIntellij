package DSA;

public class twoDArray {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col]=(int)(Math.random()*20);
            }
        }

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }
    }
}
