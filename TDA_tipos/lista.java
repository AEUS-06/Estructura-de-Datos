package TDA_tipos;

import java.util.*;

class lista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");

        System.out.println("Lista inicial: " + lista);
        lista.remove("Dos");
        System.out.println("Después de eliminar: " + lista);

        lista.add(1, "Nuevo");
        System.out.println("Después de insertar en índice 1: " + lista);

        // LinkedList
        LinkedList<String> linked = new LinkedList<>(lista);
        linked.addFirst("Cero");
        System.out.println("LinkedList: " + linked);
    }
}
