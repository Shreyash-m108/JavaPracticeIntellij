package generics;

abstract class college{
    abstract void facilities();
    void display(){
        System.out.println("You need 100% attendance");
    }
}

class kit extends college{
    void facilities(){
        System.out.println("I am KITCOEK");
    }

}

class dkte extends college{
    void facilities(){
        System.out.println("I am DKTE");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        dkte d = new dkte();
        kit k = new kit();

        d.facilities();
        k.facilities();

        d.display();
        k.display();

    }
}
