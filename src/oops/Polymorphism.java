package oops;

class Human{
    void humanInfo()
    {
        System.out.println("I am Human on Earth");
    }
    void humanInfo(String name)
    {
        System.out.println("My name is "+name);
    }
    int humanInfo(int age) {
        System.out.print("My age is ");
        return age;
    }

    void humanInfo(String city , int pin)
    {
        System.out.println("I am from "+city+" where the pincode is "+pin);
    }

}
public class Polymorphism {
    public static void main(String[] args) {
        Human human = new Human();
        human.humanInfo();
        human.humanInfo("Shreyash");
        human.humanInfo(22);
        human.humanInfo("Sangli",416416);
    }
}
