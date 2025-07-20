package multithreading;

public class Implementation {
    public static void main(String[] args) {
        System.out.println("Main Starting");
        Thread t2 = new Thread(new Thread2());
        t2.start();
        System.out.println("Main Finished");
    }
}
