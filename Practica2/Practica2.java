package Practica2;

import java.util.Scanner;//libreria para entrada de datos

public class Practica2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//objeto para entrada de datos

        while (true) {
            System.out.println("\nSelecciona el programa a ejecutar:");//menu de opciones
            System.out.println("1. Sumar números naturales del 1 al n");//opcion 1
            System.out.println("2. Imprimir números ascendentes del 1 al n");//opcion 2
            System.out.println("3. Imprimir números descendentes del n al 1");//opcion 3
            System.out.println("4. Contar cantidad de elementos de un número o cadena");//opcion 4
            System.out.println("5. Mostrar serie Fibonacci de n elementos");//opcion 5
            System.out.println("6. Mostrar factorial de un número");//opcion 6
            System.out.println("0. Salir");//opcion para salir
            System.out.print("Opción: ");//pedir opcion
            int opcion = entrada.nextInt();//variable para guardar la opcion
            entrada.nextLine();//limpiar memoria

            switch (opcion) {//switch para seleccionar la opcion
                case 1:
                    sumarNumeros(entrada);//llamar a la funcion para sumar numeros
                    break;
                case 2:
                    imprimirAscendente(entrada);//llamar a la funcion para imprimir numeros ascendentes
                    break;
                case 3:
                    imprimirDescendente(entrada);//llamar a la funcion para imprimir numeros descendentes
                    break;
                case 4:
                    contarElementos(entrada);//llamar a la funcion para contar elementos
                    break;
                case 5:
                    mostrarFibonacci(entrada);//llamar a la funcion para mostrar la serie Fibonacci
                    break;
                case 6:
                    mostrarFactorial(entrada);//llamar a la funcion para mostrar el factorial
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Programa 1: Sumar números naturales
    public static void sumarNumeros(Scanner entrada) {//funcion para mostrar la suma de numeros
        System.out.println("Este programa suma números naturales desde 1 hasta n (recursivo).");//mensaje
        System.out.print("Ingresa el número n: ");//pedir numero
        int n = entrada.nextInt();//variable para guardar el numero
        int resultado = sumaRecursiva(n);//llamar a la funcion para sumar numeros
        System.out.println("La suma de los primeros " + n + " números naturales es: " + resultado);//mensaje con el resultado
    }

    public static int sumaRecursiva(int n) {//funcion para sumar numeros
        if (n == 0) return 0;//caso base
        if (n == 1) return 1;//caso base
        return n + sumaRecursiva(n - 1);//recursividad y sumas de n con n-1
    }

    // Programa 2: Imprimir números ascendentes
    public static void imprimirAscendente(Scanner entrada) {//funcion para mostrar numeros ascendentes
        System.out.println("Programa ascendente del 1 al n (recursivo).");//mensaje
        System.out.print("Ingresa el número n: ");//pedir numero
        int n = entrada.nextInt();//variable para guardar el numero
        System.out.println("Números del 1 al " + n + ":");//mensaje con el resultado
        ascendenteRecursivo(n, 1);//llamar a la funcion para imprimir numeros ascendentes
    }

    public static void ascendenteRecursivo(int n, int i) {//funcion para imprimir numeros ascendentes
        if (i <= n) {//caso base si i es menor o igual a n
            System.out.println(i);//imprimir i
            ascendenteRecursivo(n, i + 1);//recursividad y suma de i con 1
        }
    }

    // Programa 3: Imprimir números descendentes
    public static void imprimirDescendente(Scanner entrada) {//funcion para mostrar numeros descendentes
        System.out.println("Programa descendente del n al 1 (recursivo).");//mensaje
        System.out.print("Ingresa el número n: ");//pedir numero
        int n = entrada.nextInt();//variable para guardar el numero
        System.out.println("Números del " + n + " al 1:");//mensaje con el resultado
        descendenteRecursivo(n);//llamar a la funcion para imprimir numeros descendentes
    }

    public static void descendenteRecursivo(int n) {//funcion para imprimir numeros descendentes
        if (n > 0) {//caso base si n es mayor a 0
            System.out.println(n);//imprimir n
            descendenteRecursivo(n - 1);//recursividad y resta de n con 1
        }
    }

    // Programa 4: Contar cantidad de elementos de un número o cadena
    public static void contarElementos(Scanner entrada) {//funcion para mostrar la cantidad de elementos
        System.out.print("Ingresa un número o cadena: ");//pedir numero o cadena
        String valor = entrada.nextLine();//variable para guardar el numero o cadena
        int cantidad = contarRecursivo(valor, 0);//llamar a la funcion para contar elementos
        System.out.println("Cantidad de elementos: " + cantidad);//mensaje con el resultado
    }

    public static int contarRecursivo(String valor, int indice) {//funcion para contar elementos
        if (indice >= valor.length()) return 0;//caso base si el indice es mayor o igual a la longitud del valor
        return 1 + contarRecursivo(valor, indice + 1);//recursividad, se suma 1 y se incrementa el indice
    }

    // Programa 5: Serie Fibonacci
    public static void mostrarFibonacci(Scanner entrada) {//funcion para mostrar la serie Fibonacci
        System.out.print("Ingresa la cantidad de elementos de la serie Fibonacci: ");//pedir numero
        int n = entrada.nextInt();//variable para guardar el numero
        System.out.println("Serie Fibonacci:");//mensaje con el resultado
        for (int i = 0; i < n; i++) {//bucle para imprimir la serie Fibonacci
            System.out.print(fibonacciRecursivo(i) + " ");//llamar a la funcion para calcular el numero Fibonacci
        }
        System.out.println();
    }

    public static int fibonacciRecursivo(int n) {//funcion para calcular el numero Fibonacci
        if (n == 0) return 0;//caso base
        if (n == 1) return 1;//caso base
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);//recursividad, se suma el numero Fibonacci de n-1 y n-2
    }

    // Programa 6: Factorial
    public static void mostrarFactorial(Scanner entrada) {//funcion para mostrar el factorial
        System.out.print("Ingresa un número para calcular su factorial: ");//pedir numero
        int n = entrada.nextInt();//variable para guardar el numero
        System.out.println("Factorial de " + n + " (recursivo):");//mensaje con el resultado
        System.out.println(factorialRecursivo(n));//llamar a la funcion para calcular el factorial
    }

    public static long factorialRecursivo(int n) {//funcion para calcular el factorial
        if (n == 1 || n == 0) return 1;//caso base
        return n * factorialRecursivo(n - 1);//recursividad, se multiplica n por el factorial de n-1
    }
}
