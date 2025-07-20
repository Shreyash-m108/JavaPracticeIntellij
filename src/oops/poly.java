package oops;

class Aa{
    public void print(){
        System.out.println("I am in Aa");
    }
}

class Bb extends Aa{
    public void print(){
        System.out.println("I am in Bb");
    }
}

public class poly {
    public static void main(String[] args) {
        Bb bb = new Bb();
        Aa aa = new Aa();
        aa.print();

    }

}
