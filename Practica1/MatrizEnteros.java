package Practica1;

public class MatrizEnteros {
    private int[][] datos;   //matriz de numeros enteros
    private int filas;
    private int columnas;

    //constructor para inicializar la matriz
    public MatrizEnteros(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        datos = new int[filas][columnas];
    }

    //modificar el valor en una posición [fila][columna]
    public void modificar(int fila, int columna, int valor) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            datos[fila][columna] = valor;
        } else {
            System.out.println("Posición inválida en la matriz.");
        }
    }

    //obtener el valor en una posicion [fila][columna]
    public int obtener(int fila, int columna) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            return datos[fila][columna];
        } else {
            System.out.println("Posición inválida en la matriz.");
            return -1; // Valor de error
        }
    }

    //cantidad total de elementos
    public int cantidadElementos() {
        return filas * columnas;
    }

    //sumar los elementos de una fila
    public int sumarFilaColumna(int fila, int columna) {
        int suma = 0;

        //sumar fila
        if (fila >= 0 && fila < filas) {
            for (int j = 0; j < columnas; j++) {
                suma += datos[fila][j];
            }
        } else {
            System.out.println("Fila inválida.");
        }

        //sumar columna
        if (columna >= 0 && columna < columnas) {
            for (int i = 0; i < filas; i++) {
                suma += datos[i][columna];
            }
        } else {
            System.out.println("Columna inválida.");
        }

        return suma;
    }

    //mostrara todos los datos de la matriz
    public void mostrar() {
        System.out.println("Matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(datos[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
