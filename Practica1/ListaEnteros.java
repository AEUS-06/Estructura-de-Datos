package Practica1;

public class ListaEnteros {
    private int[] lista;  //array que almacena los datos enteros
    private int contador; //contador de elementos en la lista

    //constructor que inicializa el array con un tamaño dado
    public ListaEnteros(int tamaño){
        this.lista = new int[tamaño];
        this.contador=0;
    }

    //método para agregar un entero a la lista
    public void agregar(int valor){
        if (contador < lista.length){
            lista[contador] = valor;
            contador++;
        }
        else {
            System.out.println("Lista llena, no se puede agregar más elementos.");
        }
    }

    //eliminar un elemento en una posición específica
    public void eliminar(int posicion){
        if (posicion >= 0 && posicion < contador){
            for (int i = posicion; i < contador-1; i++){
                lista[i] = lista[i+1];  //desplazar elementos a la izquierda
            }
            contador--; //restar el contador
        }
        else{
            System.out.println("Posición inválida.");
        }
    }

    //obtener el valor en una posicion dada
    public int obtener(int posicion){
        if (posicion >= 0 && posicion < contador){
            return lista[posicion];
        }
        else {
            System.out.println("Posicion invalida");
            return -1; //valor de error
        }
    }

    //modificar el valor en una posicion dada
    public void modificar(int posicion, int nuevoValor){
        if (posicion >= 0 && posicion < contador){
            lista[posicion] = nuevoValor;
        }
        else {
            System.out.println("Posicion invalida");
        }
    }

    //saber cuantos elemento tiene la lista
    public int tamaño(){
        return contador;
    }

    //ordenar la lista con algoritmo bbuble sort
    public void ordenar(){
        for (int i=0; i < contador-1; i++){
            for (int j=0; j < contador-i-1; j++){
                if (lista[j] > lista[j+1]){
                    int temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;
                }
            }
        }
    }

    //mostrar todos los elementos de la lista 
    public void mostrar(){
        System.out.print("Elementos en la lista: ");
        for (int i=0; i < contador; i++){
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }
}
