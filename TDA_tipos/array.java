package TDA_tipos;

class arreglo {
    public static void main(String[] args) {
        // Declaración e inicialización de un arreglo
        int[] numeros = {10, 20, 30, 40, 50};

        // Acceso a elementos
        System.out.println("Elemento en la posición 2: " + numeros[2]);

        // Modificación de un elemento
        numeros[1] = 99;
        System.out.println("Elemento modificado en la posición 1: " + numeros[1]);

        // Recorrido del arreglo
        System.out.println("Recorriendo el arreglo:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
