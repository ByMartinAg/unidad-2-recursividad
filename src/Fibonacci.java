import java.util.Scanner;
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


        public static void llamadaFibonacci() {
            System.out.println("Ingrese un numero");
            int numero = new Scanner(System.in).nextInt();
            System.out.println("La secuencia de Fibonacci es: ");
            System.out.println(fibonacci(numero));

        }
}
