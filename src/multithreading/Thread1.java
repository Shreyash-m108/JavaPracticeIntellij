package multithreading;

public class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++)
            System.out.println("This is man made thread"+i);
    }
}
