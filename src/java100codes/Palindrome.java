package java100codes;

public class Palindrome {
    public static void main(String[] args) {
        int num=123421; int reverse=0; int rem; int temp=num;

        while(temp>0){
            rem =temp%10;
            reverse = reverse *10 + rem;
            temp = temp/10;
        }

        System.out.println(num==reverse ?"Palindrome":"Not Palindrome");



    }
}
