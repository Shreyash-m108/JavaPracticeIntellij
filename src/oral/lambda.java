package oral;
import java.util.Scanner;
public class lambda {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*  SumInter i = (a,b)->{
           System.out.println(a+b);
       };

       i.Sum(4,5);*/
        System.out.println("Enter a string->");
        String a=sc.nextLine();
        StringInter stringInter = (String b)->{
            System.out.println("The length of the String is "+b.length());
        };

        stringInter.StringLength(a);
    }

}
