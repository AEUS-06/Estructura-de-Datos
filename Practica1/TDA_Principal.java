package Practica1;

import javax.swing.JOptionPane;

public class TDA_Principal {

    // Método auxiliar para pedir enteros con validación
    public static int pedirEntero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                if (input == null) { // usuario presiona "Cancelar"
                    JOptionPane.showMessageDialog(null, "Programa finalizado.");
                    System.exit(0);
                }
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido, intenta de nuevo.");
            }
        }
    }

    public static void main(String[] args) {

        // === LISTA DE ENTEROS ===
        int tamañoLista = pedirEntero("¿Cuántos elementos tendrá la lista?");
        ListaEnteros lista = new ListaEnteros(tamañoLista);

        for (int i = 0; i < tamañoLista; i++) {
            int valor = pedirEntero("Ingrese el valor #" + (i+1) + " para la lista:");
            lista.agregar(valor);
        }

        lista.mostrar();

        // obtener valor
        while (true) {
            try {
                int pos = pedirEntero("¿Qué posición deseas obtener?");
                int valor = lista.obtener(pos);
                JOptionPane.showMessageDialog(null, "Elemento en posición " + pos + ": " + valor);
                break; // si fue correcto, salimos del bucle
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Posición inválida, intenta de nuevo.");
            }
        }

        // modificar valor
        while (true) {
            try {
                int posMod = pedirEntero("¿Qué posición deseas modificar?");
                int nuevoValor = pedirEntero("Nuevo valor para la posición " + posMod + ":");
                lista.modificar(posMod, nuevoValor);
                lista.mostrar();
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Posición inválida, intenta de nuevo.");
            }
        }

        // eliminar valor
        while (true) {
            try {
                int posDel = pedirEntero("¿Qué posición deseas eliminar?");
                lista.eliminar(posDel);
                lista.mostrar();
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Posición inválida, intenta de nuevo.");
            }
        }

        lista.ordenar();
        lista.mostrar();
        JOptionPane.showMessageDialog(null, "La lista tiene " + lista.tamaño() + " elementos.");

        // === MATRIZ DE ENTEROS ===
        int filas = pedirEntero("¿Cuántas filas tendrá la matriz?");
        int columnas = pedirEntero("¿Cuántas columnas tendrá la matriz?");
        MatrizEnteros matriz = new MatrizEnteros(filas, columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int valor = pedirEntero("Ingrese valor para posición [" + i + "][" + j + "]");
                matriz.modificar(i, j, valor);
            }
        }

        matriz.mostrar();
        JOptionPane.showMessageDialog(null, "La matriz tiene " + matriz.cantidadElementos() + " elementos.");

        // suma de fila + columna
        while (true) {
            try {
                int f = pedirEntero("¿Qué fila deseas sumar?");
                int c = pedirEntero("¿Qué columna deseas sumar?");
                int suma = matriz.sumarFilaColumna(f, c);
                JOptionPane.showMessageDialog(null, "Suma de fila " + f + " y columna " + c + " = " + suma);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fila o columna inválida, intenta de nuevo.");
            }
        }

        // obtener valor de la matriz
        while (true) {
            try {
                int fOb = pedirEntero("¿Qué fila deseas consultar?");
                int cOb = pedirEntero("¿Qué columna deseas consultar?");
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
