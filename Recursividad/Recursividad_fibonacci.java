package Recursividad;

public class Recursividad_fibonacci {
    public static void main(String[] args) {
        Recursividad_fibonacci objetFibonacci = new Recursividad_fibonacci();//instancia de la clase
        System.out.println("la sucession es: " + objetFibonacci.fibonacci(12));//llamado al metodo
        System.out.println("la sucesion sin recursividad es: " + objetFibonacci.fibo2(12));//llamado al metodo

        Recursividad_fibonacci factorial = new Recursividad_fibonacci();
        System.out.println("factorial recursiva: " + factorial.factorial(5));
        System.out.println("factorial sin recursividad: " + factorial.factorial2(5));
    }

    public int fibonacci(int n) {//metodo recursivo
        if (n == 1 || n == 2) {//caso base
            return 1;//retorna 1 si n es 1 o 2
        } else {//caso recursivo
            return fibonacci(n - 1) + fibonacci(n - 2);//retorna la suma de los dos numeros anteriores
        }
    }
    
    public int fibo2 (int n){//metodo sin recursividad
        int fibo = 0, primero = 1, segundo = 0;//variables para almacenar los valores
        while (n > 0){//bucle while para calcular la sucesion
            fibo = primero + segundo;//suma de los dos numeros anteriores
            primero = segundo;//actualiza el primer numero
            segundo = fibo;//actualiza el segundo numero
            n--;//decrementa n
        }
        return fibo;//retorna el valor de fibo
    }

    public int factorial(int n){//metodo recursivo
        if (n == 0 || n == 1){//caso base
            return 1;//retorna 1 si n es 0 o 1
        } else {
            return n * factorial(n - 1);//caso recursivo, retorna n por el factorial de n-1
        }
    }

    public int factorial2(int n){//metodo sin recursividad
        int fact = 1;//variable para almacenar el factorial
        for (int i = 1; i <= n; i++){//bucle for para calcular el factorial
            fact *= i;//multiplica fact por i
        }
        return fact;//retorna el valor de fact
    }
}
