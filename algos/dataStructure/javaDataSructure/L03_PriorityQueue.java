import java.util.*;

public class L03_PriorityQueue {
    public static void main(String[] args) {
//        Priority Queue
//        First priority first
        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        System.out.println("Running ASC");
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        Queue<Double> queueDE = new PriorityQueue<>(Collections.reverseOrder());

        queueDE.offer(3.0);
        queueDE.offer(2.5);
        queueDE.offer(4.0);
        queueDE.offer(1.5);
        queueDE.offer(2.0);

        System.out.println("Running DESC");
        while(!queueDE.isEmpty()) {
            System.out.println(queueDE.poll());
        }
    }
}
