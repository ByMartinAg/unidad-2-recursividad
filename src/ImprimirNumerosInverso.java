import java.util.Scanner;
public class ImprimirNumerosInverso {
    public static void ImprimirNumerosInverso(int n) {
        if (n == 0) {
            System.out.print(n);
        } else {
            System.out.print(n);
            System.out.print("-");
            ImprimirNumerosInverso(n - 1);
        }
    }
    public static void llamadaImprimirNumerosInverso() {
        System.out.println("Ingrese un numero");
        int numero = new Scanner(System.in).nextInt();
        System.out.println("Los numeros son: ");
        ImprimirNumerosInverso(numero);
    }
}
