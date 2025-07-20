package oops;

class Cons{

    String name ;
    int age ;
    Cons(Cons c1)
    {
        this.name= c1.name;
        this.age= c1.age;
    }
    void printInfo(){
        System.out.println(name + age);
    }
    Cons(){}



}
public class Oops2 {
    public static void main(String[] args) {
        Cons c = new Cons();
        c.name="Shreyash";
        c.age=22;

        Cons c1 = new Cons(c);
        c.printInfo();
    }
}
