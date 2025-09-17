package TDA_tipos;

import java.util.*;

class EjemploMap {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");

        System.out.println("Mapa: " + mapa);
        System.out.println("Valor con clave 2: " + mapa.get(2));

        mapa.remove(1);
        System.out.println("Después de eliminar clave 1: " + mapa);

        System.out.println("Claves: " + mapa.keySet());
        System.out.println("Valores: " + mapa.values());
    }
}
