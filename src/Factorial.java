import java.util.Scanner;
// CLASE FACTORIAL
public class Factorial {
    // METODO FACTORIAL
    public static int factorial(int n) {
        // CASO BASE RECURSIVO
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    // METODO LLAMADA FACTORIAL
    public static void llamadaFactorial() {
        System.out.println("Ingrese un numero");
        int numero = new Scanner(System.in).nextInt();
        System.out.println("El factorial es: ");
        System.out.println(factorial(numero));
    }
}
