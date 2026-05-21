package Collection_Framework_2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeBasics {
    static void main() {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offerFirst(20);
        q.offerLast(5);

        System.out.println(q);
        q.pollLast();
        System.out.println(q);
        q.pollFirst();
        System.out.println(q);

        System.out.println(q.size());

        System.out.println(q.peek());
    }
}
