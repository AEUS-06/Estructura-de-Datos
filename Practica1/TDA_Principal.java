package Practica1;

import javax.swing.JOptionPane;

public class TDA_Principal {

    // Método auxiliar para pedir enteros con validación
    public static int pedirEntero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);//input guarda el valor para convertirlo a entero
                if (input == null) { // usuario presiona "Cancelar"
                    JOptionPane.showMessageDialog(null, "Programa finalizado.");
                    System.exit(0);
                }
                return Integer.parseInt(input);//convertir input a entero y retornarlo
            } catch (NumberFormatException e) {//capturar error si no es un entero
                JOptionPane.showMessageDialog(null, "Valor inválido, intenta de nuevo.");
            }
        }
    }

    public static void main(String[] args) {

        //lista de enteros
        int tamañoLista = pedirEntero("¿Cuántos elementos tendrá la lista?");
        ListaEnteros lista = new ListaEnteros(tamañoLista);
        // llenar la lista
        for (int i = 0; i < tamañoLista; i++) {
            int valor = pedirEntero("Ingrese el valor #" + (i+1) + " para la lista:");
            lista.agregar(valor);
        }

        lista.mostrar();

        // obtener valor
        while (true) {
            try {
                int pos = pedirEntero("¿Qué posición deseas obtener?"); //pos guarda la posición a obtener
                int valor = lista.obtener(pos);//lista obtener es el método que devuelve el valor en esa posición
                JOptionPane.showMessageDialog(null, "Elemento en posición " + pos + ": " + valor);
                break; // si fue correcto, salimos del bucle
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Posición inválida, intenta de nuevo.");
            }
        }

        // modificar valor
        while (true) {
            try {
                int posMod = pedirEntero("¿Qué posición deseas modificar?");//posMod guarda la posición a modificar
                int nuevoValor = pedirEntero("Nuevo valor para la posición " + posMod + ":");
                lista.modificar(posMod, nuevoValor);//modificar es el método que cambia el valor en esa posición
                lista.mostrar();
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Posición inválida, intenta de nuevo.");
            }
        }

        // eliminar valor
        while (true) {
            try {
                int posDel = pedirEntero("¿Qué posición deseas eliminar?");//posDel guarda la posición a eliminar
                lista.eliminar(posDel);//eliminar es el método que elimina el valor en esa posición
                lista.mostrar();
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Posición inválida, intenta de nuevo.");
            }
        }

        // ordenar y mostrar tamaño
        lista.ordenar();
        lista.mostrar();
        JOptionPane.showMessageDialog(null, "La lista tiene " + lista.tamaño() + " elementos.");

        //matriz de los enteros
        int filas = pedirEntero("¿Cuántas filas tendrá la matriz?");//filas guarda el número de filas de la matriz
        int columnas = pedirEntero("¿Cuántas columnas tendrá la matriz?");//columnas guarda el número de columnas de la matriz
        MatrizEnteros matriz = new MatrizEnteros(filas, columnas);//crear la matriz
        //llenar la matriz
        for (int i = 0; i < filas; i++) {//recorrer filas
            for (int j = 0; j < columnas; j++) {//recorrer columnas
                int valor = pedirEntero("Ingrese valor para posición [" + i + "][" + j + "]");//valor guarda el valor a insertar en la matriz
                matriz.modificar(i, j, valor);//modificar es el método que inserta el valor en la posición dada
            }
        }

        matriz.mostrar();
        JOptionPane.showMessageDialog(null, "La matriz tiene " + matriz.cantidadElementos() + " elementos.");

        // suma de fila + columna
        while (true) {
            try {
                int f = pedirEntero("¿Qué fila deseas sumar?");//f guarda la fila a sumar
                int c = pedirEntero("¿Qué columna deseas sumar?");//c guarda la columna a sumar
                int suma = matriz.sumarFilaColumna(f, c);//sumarFilaColumna es el método que suma la fila y columna dadas
                JOptionPane.showMessageDialog(null, "Suma de fila " + f + " y columna " + c + " = " + suma);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fila o columna inválida, intenta de nuevo.");
            }
        }

        // obtener valor de la matriz
        while (true) {
            try {
                int fOb = pedirEntero("¿Qué fila deseas consultar?");//fOb guarda la fila a consultar
                int cOb = pedirEntero("¿Qué columna deseas consultar?");//cOb guarda la columna a consultar
                int valor = matriz.obtener(fOb, cOb);
                JOptionPane.showMessageDialog(null, "Elemento en [" + fOb + "][" + cOb + "] = " + valor);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fila o columna inválida, intenta de nuevo.");
            }
        }

        JOptionPane.showMessageDialog(null, "¡Programa terminado!");
    }
}
