package operacionesarray;
import java.util.Arrays;

public class operacionesarray {
    public static void main(String[] args) {
        //pasa un array explicitamente
        //objeto para usar el array
        operacionesarray obj1 = new operacionesarray(new int[]{1, 2, 3, 4});
        System.out.println(obj1); //muestra el contenido del array
    }

    private final int[] numeros;

    //constructor
    public operacionesarray (int[] numeros){
        this.numeros = numeros;
    }

    @Override
    public String toString(){
        return "contenido del array: " + Arrays.toString(numeros);//imprime al array y el mensaje, sin usara los parentesis en toda la sentencia
    }
}
