import java.util.LinkedList;
import java.util.Queue;

public class L02_Queue {
    public static void main(String[] args) {
//        Queue
//        First in first out

//        Unlike 'Stack', Queue is interface not a class.
//        Thus, we can't create an instance of an interface.
//        So, LinkedList is to be used
        Queue<String> q = new LinkedList<>();

        q.offer("a");
        q.offer("b");
        q.offer("c");
        q.add("d");
        // add work similar to offer. add() comes from Collection while offer() comes from queue
        // There are more similarity methods. Move cursor over Queue for more info
        System.out.println(q);

        System.out.println("using 'poll()' to remove the first element");
        q.poll();
        System.out.println(q);
        System.out.println("------");
        System.out.println("Check if q is empty 'q.isEmpty()'");
        System.out.println(q.isEmpty());
        System.out.println("check size 'q.size()'");
        System.out.println(q.size());
        System.out.println("------");
        System.out.println("check if the queue contains a value 'q.contains(value)'");
        System.out.println(q.contains("b"));
    }
}
