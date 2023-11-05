import java.util.ArrayDeque;
//import java.util.LinkedList;
import java.util.Queue;

public class QueueByCollection {
    
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        System.out.println(q.peek());
    }
}
