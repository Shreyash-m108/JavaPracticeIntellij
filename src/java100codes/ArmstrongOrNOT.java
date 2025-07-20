package java100codes;

public class ArmstrongOrNOT {
    public static void main(String[] args) {
        int num = 412, size;
        int temp = num;
        size =giveLen(temp);
        System.out.println(ArmStrong(num,size));
    }

    public static int giveLen(int num) {
        int len =0;
        while(num>0){
            len++;
            num = num/10;
        }
        return len;
    }
    public static String ArmStrong(int num, int size) {
        int temp =num;
        int rem;
        int n=0;
        while(temp!=0){
            rem = temp%10;
            n = (int) (n+ Math.pow(rem,size));
            temp = temp/10;
        }

        return num==n?"It is Armstrong":"It is not Armstrong";
    }
}
