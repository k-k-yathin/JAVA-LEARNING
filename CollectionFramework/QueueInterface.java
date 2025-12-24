import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterface {
    public  static void main(String[] args) {
        // follows FIFO
        // functionality of queue data structure
        Queue<String> queue = new ArrayDeque<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.offer("4");
        System.out.println(queue);
        System.out.println("Element ready to remove:"+queue.peek());
        System.out.println("Element removed:"+queue.remove());
        System.out.println("Element removed:"+queue.poll());
        System.out.println(queue);
        queue.clear();
        queue.poll();
    }
}
