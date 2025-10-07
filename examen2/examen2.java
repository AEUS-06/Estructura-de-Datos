package examen2;

import java.util.Scanner;

public class examen2 {

    // Método para ingresar el número de líneas
    public int ingresarLineas() {
        Scanner sc = new Scanner(System.in);// objeto Scanner
        System.out.print("Ingrese el número de filas del triángulo: ");// mensaje al usuario
        return sc.nextInt();//retorna el numero ingresado
    }

    // Método recursivo para imprimir el triángulo
    public void triangulo_AxelEduardo(int n) {
        if (n > 0) {// si n es mayor que 0 se ejecuta
            triangulo_AxelEduardo(n - 1);// llamada recursiva disminuyendo n para formar el triangulo
            for (int i = 0; i < n; i++) {// ciclo para imprimir asteriscos
                System.out.print("*");// imprime asterisco
            }
            System.out.println();// salto de línea
        }
    }

    // Método para mostrar la figura
    public void MostrarFigura() {
        int lineas = ingresarLineas(); // ingresar número de líneas
        triangulo_AxelEduardo(lineas); //retorna el valor de lineas para formar el triangulo
        System.out.println("Triángulo de asteriscos completo.");
    }

    // Método principal
    public static void main(String[] args) {
        examen2 obj = new examen2(); // objeto instanciado
        obj.MostrarFigura();         // llamada al método MostrarFigura
    }
}
