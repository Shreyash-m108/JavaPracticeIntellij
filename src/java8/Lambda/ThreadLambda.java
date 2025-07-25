package java8.Lambda;

public class ThreadLambda {
    public static void main(String[] args) {
         Runnable t1 = ()->{
             for (int i = 1; i <= 10 ; i++) {
                 System.out.println(i*40);
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         };
         Thread ti1 = new Thread(t1);
         ti1.start();

         Runnable t2 = ()->{
             for (int i = 0; i <10 ; i++) {
                 System.out.println("Shreyash");
                 try {
                     Thread.sleep(1000);
                 }catch (InterruptedException e){
                     throw new RuntimeException(e);
                 }
             }
         };

         Thread ti2 = new Thread(t2);
         ti2.start();
    }
}
