package Recursividad2;
import java.util.Scanner;

public class Torres_hanoi {
    public static void torres_hanoi(int n, char origen, char auxiliar, char destino){
        if (n == 1){
            System.out.println("Mover disco 1 de" + origen + "a" + destino);
        } else {
            torres_hanoi(n-1, origen, destino, auxiliar);

            System.out.println("Mover disco" + n + "de" + origen + "a" + destino);

            torres_hanoi(n-1, auxiliar, origen, destino);
        }
    }

    public static void main(String[] args) {
        
    }
}
//mostrar datos, que se vea el juego en consola y mosytrar los datos

