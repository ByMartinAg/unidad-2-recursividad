import java.util.Scanner;
public class Contador {
    public static int Contador(String palabra) {
        if (palabra.equals("")) {
            return 0;
        } else {
            return 1 + Contador(palabra.substring(1));
        }
    }
    public static void llamadaContador() {
        System.out.println("Ingrese una palabra");
        String palabra = new Scanner(System.in).nextLine();
        System.out.println("La cantidad de letras es: ");
        System.out.println(Contador(palabra));
    }
}
