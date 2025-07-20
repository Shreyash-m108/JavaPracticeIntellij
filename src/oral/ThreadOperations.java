package oral;

public class ThreadOperations {

    public static void main(String[] args) {
        System.out.println("The process starts....");
        int a= 54+46;
        System.out.println("Sum is "+ a);
        Thread t1= Thread.currentThread();
        t1.setName("Shreyash");
        String threadnm = t1.getName();
        System.out.println(t1.threadId());
        System.out.print("I am running with thread "+threadnm+"\n");
        System.out.println("The process ends....");
    }
}
