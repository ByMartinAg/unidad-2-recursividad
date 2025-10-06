import java.util.Scanner;
public class ImprimirNumeros {
    public static void ImprimirNumeros(int n, int numero) {
        if (n == 0) {
            System.out.print(numero);
        } else {
            System.out.print(numero);
            System.out.print("-");
            ImprimirNumeros(n - 1,numero + 1);
        }
    }
    public static void llamadaImprimirNumeros() {
        System.out.println("Ingrese un numero");
        int numero = new Scanner(System.in).nextInt();
        System.out.print("Los numeros son: ");
        ImprimirNumeros(numero,0);
    }
}
