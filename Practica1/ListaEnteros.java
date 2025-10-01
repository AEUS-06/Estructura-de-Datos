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
        if (posicion >= 0 && posicion < contador){//verificar que la posición es válida
            for (int i = posicion; i < contador-1; i++){//recorrer desde la posición dada hasta el final
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
        if (posicion >= 0 && posicion < contador){//verificar que la posición es válida
            return lista[posicion];//retornar el valor en la posición dada
        }
        else {
            System.out.println("Posicion invalida");
            return -1; //valor de error
        }
    }

    //modificar el valor en una posicion dada
    public void modificar(int posicion, int nuevoValor){
        if (posicion >= 0 && posicion < contador){//verificar que la posición es válida
            lista[posicion] = nuevoValor;//asignar el nuevo valor en la posición dada
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
        for (int i=0; i < contador-1; i++){//recorrer toda la lista
            for (int j=0; j < contador-i-1; j++){//recorrer desde el inicio hasta el final menos los ya ordenados
                if (lista[j] > lista[j+1]){//comparar elementos 
                    int temp = lista[j];//intercambiar si están en el orden incorrecto
                    lista[j] = lista[j+1];//intercambiar
                    lista[j+1] = temp;//intercambiar
                }
            }
        }
    }

    //mostrar todos los elementos de la lista 
    public void mostrar(){
        System.out.print("Elementos en la lista: ");
        for (int i=0; i < contador; i++){// a recorriendo 
            System.out.print(lista[i] + " ");//va antando los valores 
        }
        System.out.println();
    }
}
