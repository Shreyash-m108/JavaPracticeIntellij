package oops;

interface A {
    default void showA(){
        System.out.println("I am in A.");
    }
}

interface B{
    default void showB(){
        System.out.println("I am in B.");
    }
}

class C implements A,B{
    public void showA() {
        System.out.println("I am in CA.");
    }

    public void showB(){
        System.out.println("I am in CB.");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
    }
}
