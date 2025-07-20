package oral;
import javax.sound.sampled.Line;
import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class Filehandling {
    Filehandling(){
        System.out.println("False");
    }
    public static void main(String[] args) {

       /* try{
            File fileCreate = new File("D:\\Java\\Shreyash\\src\\newFile.txt");
            System.out.println("File Successfully Created.");
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
        try{
            FileWriter fileWriter = new FileWriter("newFile.txt");
            fileWriter.write("This the content written by the user.\n And this is next line of the code.");
            System.out.println("Content of file is succesfully written.");
            fileWriter.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }*/

        /*try{
            File newFile =new File("newFile.txt");
            Scanner sc = new Scanner(newFile);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(Exception e) {
            System.out.println("" + e);
        }*/


        /*File newFile = new File("newFile.txt");
        String path = newFile.getAbsolutePath();
        System.out.println(path);*/

        Filehandling fh = new Filehandling();

    }

}
