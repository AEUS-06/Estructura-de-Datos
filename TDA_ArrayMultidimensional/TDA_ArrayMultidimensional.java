package TDA_ArrayMultidimensional;
import java.util.Arrays;

public class TDA_ArrayMultidimensional {

    private final int[][] matriz;

    //constructor que recibe una matriz 2D
    //para memoria estatica
    //public TDA_ArrayMultidimensional (int [][] matriz){
    //  this.matriz=matriz;
    //}

    public TDA_ArrayMultidimensional(int[]...matriz){
        this.matriz = matriz;
    }

    //mostrar la matriz completa
    public void mostrarMatriz(){
        System.out.println("contenido de la matriz: ");
        for (int[] fila : matriz){
            System.out.println(Arrays.toString(fila));
        }
    }

    //obtener numero de filas
    public int getFilas(){
        return matriz.length;
    }

    //obtener numero de columnas
    //(suponiendo que todas las filas tienen el mismo tamaño)
    public int getColumnas(){
        return matriz[0].length;
    }

    //obtener valor en una posicion dada
    public int obtener(int fila, int columna){
        if (fila >= 0 && fila < getFilas() && columna >= 0 && columna < getColumnas()){
            return matriz[fila][columna];
        }
        else {
            throw new IndexOutOfBoundsException("Posición inválida en la matriz.");
        }
    }

    //modificar valor en una posicion dada
    public void modificar(int fila, int columna, int nuevoValor){
        if (fila >= 0 && fila < getFilas() && columna >= 0 && columna < getColumnas()){
            matriz[fila][columna] = nuevoValor;
        }
        else {
            throw new IndexOutOfBoundsException("Posición inválida en la matriz.");
        }
    }

    //mostrar la matriz con deepToString
    @Override
    public String toString() {
        return "Matriz:\n" + Arrays.deepToString(matriz);
    }

    //metodo para recorrer fila por fila
    public void recorrerFilaPorFila(){
        System.out.println("Recorriendo fila por fila:");
        for (int i = 0; i < getFilas(); i++){
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < getColumnas(); j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); //salto de linea al terminar una fila
        }
    }
    //metodo principal para pruebas
    public static void main(String[] args) {
        TDA_ArrayMultidimensional matriz = new TDA_ArrayMultidimensional(
            new int[]{1, 2, 3},
            new int[]{4, 5, 6},
            new int[]{7, 8, 9}
        );

        matriz.mostrarMatriz();
        matriz.recorrerFilaPorFila();

        System.out.println("\nElemento en [1][2]: " + matriz.obtener(1, 2));

        System.out.println("\nModificando elemento en [0][0] a 99...");
        matriz.modificar(2, 0, 99);

        System.out.println("\nMatriz después de la modificación:");
        matriz.mostrarMatriz();
    }
}
