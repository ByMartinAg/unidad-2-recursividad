import java.util.Scanner;
// CLASE IMPRIMIR NUMEROS INVERSO
public class ImprimirNumerosInverso {
    // METODO IMPRIMIR NUMEROS INVERSO
    public static void ImprimirNumerosInverso(int n) {
        if (n == 0) {
            System.out.print(n);
        } else {
            System.out.print(n);
            System.out.print("-");
            ImprimirNumerosInverso(n - 1);
        }
    }
    // METODO LLAMADA IMPRIMIR NUMEROS INVERSO
    public static void llamadaImprimirNumerosInverso() {
        System.out.println("Ingrese un numero");
        int numero = new Scanner(System.in).nextInt();
        System.out.println("Los numeros son: ");
        ImprimirNumerosInverso(numero);
    }
}
