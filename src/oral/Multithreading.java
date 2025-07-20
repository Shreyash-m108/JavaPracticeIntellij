package oral;

import static java.lang.Thread.sleep;

public class Multithreading implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<5;i++)
        {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Multithreading multi = new Multithreading();
        Thread thread = new Thread(multi);
        multi.run();
    }
}
