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
    public void modificar(int fila, int columna, int valor) {//modificar es el método que inserta el valor en la posición dada
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {//verificar que la posición es válida
            datos[fila][columna] = valor;//asignar el valor en la posición dada
        } else {
            System.out.println("Posición inválida en la matriz.");
        }
    }

    //obtener el valor en una posicion [fila][columna]
    public int obtener(int fila, int columna) {//obtener es el método que retorna el valor en la posición dada
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {//verificar que la posición es válida
            return datos[fila][columna];//retornar el valor en la posición dada
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
        if (fila >= 0 && fila < filas) {//sumar solo si la fila es válida
            for (int j = 0; j < columnas; j++) {//sumar todos los elementos de la fila dada
                suma += datos[fila][j];//sumar los elementos de la fila
            }
        } else {
            System.out.println("Fila inválida.");
        }

        //sumar columna
        if (columna >= 0 && columna < columnas) {//sumar solo si la columna es válida
            for (int i = 0; i < filas; i++) {//sumar todos los elementos de la columna dada
                suma += datos[i][columna];//sumar los elementos de la columna
            }
        } else {
            System.out.println("Columna inválida.");
        }

        return suma;
    }

    //mostrara todos los datos de la matriz
    public void mostrar() {
        System.out.println("Matriz:");
        for (int i = 0; i < filas; i++) {//recorrer filas
            for (int j = 0; j < columnas; j++) {//recorrer columnas
                System.out.print(datos[i][j] + "\t");//mostrar el elemento con tabulación
            }
            System.out.println();
        }
    }
}
