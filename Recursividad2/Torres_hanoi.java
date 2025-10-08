package Recursividad2;

import java.util.Scanner;

public class Torres_hanoi {

    // Método recursivo para resolver las Torres de Hanói
    public static void torres_hanoi(int n, char origen, char auxiliar, char destino) {
        // n: número de discos, origen: torre de origen, auxiliar: torre auxiliar, destino: torre destino
        if (n == 1) {// caso base
            System.out.println("Mover disco 1 de " + origen + " a " + destino);// mover disco 1 directamente al destino
        } else {
            // mover n-1 discos al auxiliar
            torres_hanoi(n - 1, origen, destino, auxiliar);
            // mover el disco más grande al destino
            System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
            // mover los n-1 discos del auxiliar al destino
            torres_hanoi(n - 1, auxiliar, origen, destino);
        }
    }

    // Método iterativo con bucles que imprime EXACTAMENTE lo mismo que el recursivo
    public static void torres_hanoi_iterativo(int n, char origen, char auxiliar, char destino) {
        // número total de movimientos necesarios para n discos
        int movimientos = (int) (Math.pow(2, n) - 1); // fórmula: 2^n - 1
        System.out.println("Número total de movimientos necesarios: " + movimientos);
        System.out.println("Movimientos (resueltos con bucle):");

        // arreglo para las torres (solo para determinar el disco a mover)
        char[] torres = {origen, auxiliar, destino};
        
        // bucle principal para todos los movimientos
        for (int i = 1; i <= movimientos; i++) {
            // Encontrar el disco a mover usando la propiedad del bit menos significativo
            int disco = 0;// disco a mover
            int temp = i;// variable temporal para calcular el disco
            while (temp % 2 == 0) {// mientras sea par
                disco++;// incrementar el disco
                temp /= 2;// dividir entre 2
            }
            disco++; // los discos van de 1 a n
            
            // Determinar las torres de origen y destino basado en el número de movimiento
            int from = 0, to = 0;// índices de las torres
            
            if (n % 2 == 1) {
                // Para n impar
                switch ((i / (int)Math.pow(2, disco - 1)) % 3) {// determinar las torres
                    case 0: from = 0; to = 2; break;// mover de origen a destino
                    case 1: from = 0; to = 1; break;// mover de origen a auxiliar
                    case 2: from = 1; to = 2; break;// mover de auxiliar a destino
                }
            } else {
                // Para n par
                switch ((i / (int)Math.pow(2, disco - 1)) % 3) {
                    case 0: from = 0; to = 1; break;// mover de origen a auxiliar
                    case 1: from = 0; to = 2; break;// mover de origen a destino
                    case 2: from = 1; to = 2; break;// mover de auxiliar a destino
                }
            }
            
            // Imprimir el movimiento exactamente igual que el recursivo
            System.out.println("Mover disco " + disco + " de " + torres[from] + " a " + torres[to]);
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// objeto Scanner para entrada de datos
        // Solicitar al usuario el número de discos
        System.out.print("Ingrese el número de discos: ");
        int n = sc.nextInt();// leer el número de discos

        System.out.println("\n--- Solución recursiva ---");
        torres_hanoi(n, 'A', 'B', 'C'); // llamada recursiva

        System.out.println("\n--- Versión iterativa ---");
        torres_hanoi_iterativo(n, 'A', 'B', 'C'); // llamada iterativa

        sc.close();// cerrar el objeto Scanner
    }
}