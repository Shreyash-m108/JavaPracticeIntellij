package hackerrank;

import java.util.Scanner;

public class readFileTillEOF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linenumber =1;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(linenumber+" "+line);
            linenumber++;
        }
        sc.close();
    }
}
