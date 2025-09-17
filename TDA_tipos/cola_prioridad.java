package TDA_tipos;

import java.util.*;

class EjemploPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("Cola de prioridad: " + pq);
        System.out.println("Mayor prioridad: " + pq.peek());
        System.out.println("Elemento eliminado: " + pq.poll());
        System.out.println("Después de poll: " + pq);
    }
}
