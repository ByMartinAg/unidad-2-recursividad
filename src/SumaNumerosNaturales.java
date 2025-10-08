import java.util.Scanner;
// CLASE SUMA NUMEROS NATURALES
public class SumaNumerosNaturales {
    // METODO SUMA NUMEROS NATURALES
    public static int SumaNumerosNaturales(int n) {
        // CASO BASE RECURSIVO
        if (n == 1 || n== 0) {
            return 1;
        }
         else {
            return n + SumaNumerosNaturales(n - 1);
         }
    }
    // METODO PARA LLAMAR AL METODO SUMA NUMEROS NATURALES
    public static void llamadaSumaNumerosNaturales (){
        System.out.println("Ingrese un numero");
        int n = new Scanner(System.in).nextInt();
        System.out.println("La suma de todos los numeros es: ");
        System.out.print(SumaNumerosNaturales(n));

    }

}
