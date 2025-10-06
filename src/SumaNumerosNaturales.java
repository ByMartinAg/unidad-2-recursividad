
import java.util.Scanner;
public class SumaNumerosNaturales {
    public static int SumaNumerosNaturales(int n) {
        if (n == 1 || n== 0) {
            return 1;
        }
         else {
            return n + SumaNumerosNaturales(n - 1);
         }
    }
    public static void llamadaSumaNumerosNaturales (){
        System.out.println("Ingrese un numero");
        int n = new Scanner(System.in).nextInt();
        System.out.println("La suma de todos los numeros es: ");
        System.out.print(SumaNumerosNaturales(n));

    }

}
