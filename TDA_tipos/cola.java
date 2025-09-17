package TDA_tipos;

import java.util.*;
import java.util.Queue;

class cola {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        // Operaciones
        cola.add("A"); 
        cola.add("B");
        cola.add("C");

        System.out.println("Cola: " + cola);
        System.out.println("Frente de la cola: " + cola.peek()); // Consultar
        System.out.println("Elemento eliminado: " + cola.poll()); // Eliminar
        System.out.println("Cola final: " + cola);
    }
}
