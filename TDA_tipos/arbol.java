package TDA_tipos;

class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = derecho = null;
    }
}

class Arbol {
    Nodo raiz;

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) return new Nodo(valor);
        if (valor < raiz.valor) raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        else if (valor > raiz.valor) raiz.derecho = insertarRec(raiz.derecho, valor);
        return raiz;
    }

    public void enOrden(Nodo nodo) {
        if (nodo != null) {
            enOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            enOrden(nodo.derecho);
        }
    }

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);

        System.out.println("Recorrido en orden:");
        arbol.enOrden(arbol.raiz);
    }
}
