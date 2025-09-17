package TDA_tipos;

import java.util.*;

class conjunto {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Rojo");
        conjunto.add("Verde");
        conjunto.add("Azul");
        conjunto.add("Rojo"); // duplicado, no se agrega

        System.out.println("Conjunto: " + conjunto);
        conjunto.remove("Verde");
        System.out.println("Después de eliminar: " + conjunto);

        System.out.println("¿Contiene Azul?: " + conjunto.contains("Azul"));
    }
}
