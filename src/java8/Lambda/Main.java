package java8.Lambda;


public class Main {
    public static void main(String[] args) {
        //without help of lambda
        // MyInterface dog = new MyInterface() {
        //     @Override
        //     public void speak() {
        //         System.out.println("Dog is barking");
        //     }
        // };

        // dog.speak();

        //With the help of lambda
        MyInterface i = ()->{
            System.out.println("I am speaking with lambda.");
        };

        i.speak();
    }
}
