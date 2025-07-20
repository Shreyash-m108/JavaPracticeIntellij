package oops;

public class LambdaExpression {
    public static void main(String[] args) {
        Shreyash obj = (int amt)->{
            System.out.println("I have"+amt+"Rupees");
            //return amt;
        };

        obj.money(5000);
    }
}

@FunctionalInterface
interface Shreyash{
    void money(int amt);
}
