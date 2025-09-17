package TDA_tipos;

import java.util.*;

class grafo {
    private Map<Integer, List<Integer>> adyacencia;

    public grafo() {
        adyacencia = new HashMap<>();
    }

    public void agregarVertice(int v) {
        adyacencia.putIfAbsent(v, new ArrayList<>());
    }

    public void agregarArista(int origen, int destino) {
        adyacencia.get(origen).add(destino);
    }

    public void mostrarGrafo() {
        for (var entrada : adyacencia.entrySet()) {
            System.out.println("Vértice " + entrada.getKey() + " -> " + entrada.getValue());
        }
    }

    public static void main(String[] args) {
        grafo grafo = new grafo();
        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);

        grafo.agregarArista(1, 2);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(1, 3);

        System.out.println("Representación del grafo:");
        grafo.mostrarGrafo();
    }
}
