package Stack;

import java.util.*;


public class InBuiltStackEg {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> linked = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.offer(12);
        pq.offer(18);
        pq.offer(1);
        pq.offer(2);
        pq.offer(1);
        pq.offer(17);
        pq.offer(19);
        pq.offer(99);

        System.out.println("Printing priority queue:- ");
        System.out.println("Priority Queue => "+ pq);

        pq.poll();
        pq.poll();
        pq.poll();
        System.out.println(pq);

        deque.add(10);
        deque.add(11);
        deque.add(12);
        deque.add(13);
        System.out.println("Printing DEQUE Elements:- ");
        System.out.println(deque);

        deque.addFirst(28);
        deque.addLast(38);
        deque.offer(100);

        System.out.println(deque);
        deque.poll();
        System.out.println(deque);


        // In queue add => offer, Remove => Poll
        queue.add("Aastha Bai");
        System.out.println(queue.offer("Mummy"));
        queue.offer("Pappa");
        queue.offer("Anvesh");
        System.out.println("Priting Queue elements:- ");
        System.out.println("Queue = " + queue);
        queue.poll();
        queue.poll();

        System.out.println(queue);

        System.out.println(queue.peek());

        set.add(12);
        set.add(11);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(15);
        set.add(15);

        System.out.println("Set = " + set);

        System.out.println("Now printing LinkedHashSet");
        linked.add(1);
        linked.add(2);
        linked.add(3);
        linked.add(4);
        linked.add(5);
        linked.add(1);
        linked.add(1);

        System.out.println("LinkedHashSet = " + linked);


    }
}
