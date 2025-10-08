import java.util.Scanner;
// CLASE CONTADOR
public class Contador {
    // METODO CONTADOR
    public static int Contador(String palabra) {
        if (palabra.equals("")) {
            return 0;
        } else {
            return 1 + Contador(palabra.substring(1));
        }
    }
    // METODO LLAMADA CONTADOR
    public static void llamadaContador() {
        System.out.println("Ingrese una palabra");
        String palabra = new Scanner(System.in).nextLine();
        System.out.println("La cantidad de letras es: ");
        System.out.println(Contador(palabra));
    }
}
