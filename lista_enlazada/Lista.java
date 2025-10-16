package lista_enlazada;

public class Lista {
    protected Nodo inicio;
    protected Nodo fin;

    public Lista(){
        inicio = null;
        fin = null;
    }

    //operaciones (insertar, eliminar, buscar, imprimir, verificar si esta vacio)
    //verificar si es vecia
    public boolean esVacia(){
        if (inicio == null){
            return true;
        } else {
            return false;
        }
    }
    //insertar inicio
}
