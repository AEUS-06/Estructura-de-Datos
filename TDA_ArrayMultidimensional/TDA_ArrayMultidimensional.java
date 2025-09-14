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
    public static void main(String[] args) {
        
    }
}
