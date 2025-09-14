package TDA_array;
//librerias para utilizar arrays
import java.util.Arrays;
import javax.swing.JOptionPane;

public class TDA_array {
    public static void main(String[] args) {
        //tipo de datos bstracto parte publica, parte privada
        //declarando arreglo de 10 espacios en memoria

        int numeros[]=new int[10]; //forma 1 array en una sola sentencia
        //int numero []; //forma 2, en 2 sentencias
        // numero = new int[10]; forma 2

        String palabra[]=new String[10]; //segundo array

        int numeros2[]=new int [numeros.length]; //copia la cantidad (longitud) del arreglo "numeros" 

        int i; //variable para el ciclo for

        for(i = 0; i < 10; i++){ //ciclo for
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog
            (null, "ingrese un dato entero" + i));  //imprime un mensaje con joption pane
        }

        //mostrar datos conforme se ingresaron
        System.out.println("datos sin ordenar");
        for (i=0; i<10; i++){
            System.out.println("["+numeros[i]+"]");
        }

        //Orden en operacion sort
         System.out.println("\n datos ordenados");
         Arrays.sort(numeros);// esto aplica la funcion sort
        for (i=0; i<10; i++){
            System.out.println("["+numeros[i]+"]");
        }

        //rellenar el arreglo operacion fill
        System.out.println("\n operacion de relleno");
        Arrays.fill(palabra, "mensaje de relleno Atekokoli");
        for (i=0; i<10; i++){
            System.out.println("["+palabra[i]+"]");
        }

         //copiando datos del arreglo numeros de operacion copy
        System.out.println("\ncopiando el array");
        System.arraycopy(numeros, 0, numeros2, 0, numeros.length);
        for (i=0; i<10; i++){
            System.out.println("["+numeros2[i]+"]");
        }

        //comparar arrays
        boolean iguales = Arrays.equals(numeros, numeros2);
        System.out.println("Los arrays son iguales?"+iguales);

        /*arrays definido con elementos
         * int[] arrayLleno = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         */
    }
}
