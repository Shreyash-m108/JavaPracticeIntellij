package oral;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteToChar {
    public static void main(String[] args) {
       /* try(InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.println("Enter some numbers:");
            int data = isr.read();
            while(isr.ready()){
                System.out.println((char) data);
                data= isr.read();
            }


        }catch(IOException e){
            System.out.println(e.getMessage());
        }*/

        try(FileReader fr = new FileReader("abc.txt")) {
            int data = fr.read();
            while(fr.ready()){
                System.out.print((char) data);
                data= fr.read();
            }


        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
