package TDA_tipos;

import java.util.*;

class deque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("A");
        deque.addLast("B");
        deque.addFirst("C");

        System.out.println("Deque: " + deque);
        deque.removeLast();
        System.out.println("Después de removeLast: " + deque);
    }
}
