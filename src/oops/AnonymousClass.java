package oops;

public class AnonymousClass {

    outerClass obj = new outerClass(){
        @Override
        void outerMethod() {

        }
    };
}

class outerClass {
    void outerMethod() {
        System.out.println("This is the outer method.");
    }
}