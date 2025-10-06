import java.util.Scanner;
public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void llamadaFactorial() {
        System.out.println("Ingrese un numero");
        int numero = new Scanner(System.in).nextInt();
        System.out.println("El factorial es: ");
        System.out.println(factorial(numero));
    }
}
