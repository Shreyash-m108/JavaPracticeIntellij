package generics;

interface Ramesh {
    void son();
    
}

interface Annapa{
    void grandSon();
}

class Somesh implements Ramesh, Annapa {

    public void son(){
        System.out.println("I am son.");
    }


    @Override
    public void grandSon() {
        System.out.println("I am grandson.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Somesh s = new Somesh();
        s.grandSon();
        s.son();
    }
}
