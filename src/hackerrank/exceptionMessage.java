package hackerrank;

import java.util.Scanner;

public class exceptionMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B =sc.nextInt();
        int H =sc.nextInt();
        try {
            if(B<=0 || H<=0)
            {
                throw new Exception("Breadth and height must be positive");
            } else if (B>=100 || H>=100){
                throw new Exception("Breadth and height must be positive");
            }
            else{
                System.out.println(B*H);
            }
        }catch (Exception e){
            System.out.println("java.lang.Exception: "+ e.getMessage());
        }
        sc.close();
    }
}
