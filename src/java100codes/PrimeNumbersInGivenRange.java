package java100codes;

public class PrimeNumbersInGivenRange {
    public static void main(String[] args) {
        int lower = 5, upper = 20;
        for(int i=lower; i<=upper ;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        int count=0;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
