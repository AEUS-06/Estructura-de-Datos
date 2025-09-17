package TDA_tipos;

import java.util.Stack;

class pila {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        // Operaciones
        pila.push(10); // Insertar
        pila.push(20);
        pila.push(30);

        System.out.println("Pila: " + pila);
        System.out.println("Cima de la pila: " + pila.peek()); // Consultar
        System.out.println("Elemento eliminado: " + pila.pop()); // Eliminar
        System.out.println("Pila final: " + pila);
    }
}
