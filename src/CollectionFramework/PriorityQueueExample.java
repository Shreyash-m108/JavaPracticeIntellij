package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(50);
        queue.offer(5);
        queue.offer(10);
        queue.offer(64);
        queue.offer(1);
        queue.offer(3);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}

