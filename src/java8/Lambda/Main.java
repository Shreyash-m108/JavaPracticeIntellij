package java8.Lambda;


public class Main {
    public static void main(String[] args) {
        /*without help of lambda
         MyInterface dog = new MyInterface() {
             @Override
             public void speak() {
                 System.out.println("Dog is barking");
             }
         };

         dog.speak();*/

        //With the help of lambda
        /*MyInterface i = () -> {
            System.out.println("I am speaking with lambda.");
        };

        i.speak();*/


/*
        AddInterface add1 = (a ,b)-> {
            return a+b;
        };

        AddInterface add2 = (a,b)-> a+b;

        System.out.println(add2.add(52,69));
        System.out.println(add1.add(43,5));*/

        //String Length

        StringLengthInterface str1 = (str)->str.length();
        System.out.println(str1.strLength("Shreyash"));

        StringLengthInterface str2 = String::length;
        System.out.println(str2.strLength("Handkerchief"));
    }
}
