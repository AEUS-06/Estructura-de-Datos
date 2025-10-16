package lista_enlazada;

public class Nodo {
    public int dato;
    public Nodo siguiente;
    //consturctor para el nodo final (insertar)
    public Nodo(int charmander) {
        this.dato = charmander;
        this.siguiente = null;
    }
    //consturctor para nodo inicial (insertar)
    public Nodo(int charmander, Nodo n) {
        this.dato = charmander;
        this.siguiente = n;
    }
}
