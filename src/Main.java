import java.util.Scanner;
public class Main {
    // Clase Main para llamar a las clases recursivas
    public static void main(String[] args) {
        // CREA LOS OBJETOS PARA USAR LOS METODOS DE LAS CLASES
        SumaNumerosNaturales Ejercicio1 = new SumaNumerosNaturales();
        ImprimirNumeros Ejercicio2 = new ImprimirNumeros();
        ImprimirNumerosInverso Ejercicio3 = new ImprimirNumerosInverso();
        Contador Ejercicio4 = new Contador();
        Factorial Ejercicio5 = new Factorial();
        Fibonacci Ejercicio6 = new Fibonacci();

        int menu = 0;
        // INICIA EL MENU
        System.out.println("Menu");
        // MIENTRAS EL MENU SEA IGUAL A 0, SE EJECUTA EL MENU
        while(menu==0){
            // IMPRIME EL MENU
            System.out.println("1. Suma de numeros naturales");
            System.out.println("2. Imprimir numeros");
            System.out.println("3. Imprimir numeros inverso");
            System.out.println("4. Contador");
            System.out.println("5. Factorial");
            System.out.println("6. Fibonacci");
            System.out.println("7. Salir");
            System.out.println("Ingrese una opcion");
            menu = new Scanner(System.in).nextInt();

            // UTILIZA UN MENU A BASE DE SWITCH PARA ELEGIR EL EJERCICIO
            switch(menu){
                // EN CASO DE QUE LA OPCION SEA 1, SE EJECUTA EL EJERCICIO 1 Y ASI DEPENDIENDO EL CASO
                case 1:
                    Ejercicio1.llamadaSumaNumerosNaturales();
                    break;
                case 2:
                    Ejercicio2.llamadaImprimirNumeros();
                    break;
                case 3:
                    Ejercicio3.llamadaImprimirNumerosInverso();
                    break;
                case 4:
                    Ejercicio4.llamadaContador();
                    break;
                case 5:
                    Ejercicio5.llamadaFactorial();
                    break;
                case 6:
                    Ejercicio6.llamadaFibonacci();
                    break;
                case 7:
                    menu = 1;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("\n");
            // PREGUNTA SI DESEA CONTINUAR
            System.out.println("Desea continuar");
            System.out.println("1. Si");
            System.out.println("2. No");
            int decision = 0;
            decision = new Scanner(System.in).nextInt();
            // SI LA DECISION ES 2, SE SALE DEL MENU SI NO ES EL CASO CONTINUA
            if(decision==2){
                menu = 1;
            }else if(decision==1){
                menu = 0;
                System.out.println("\n Menu");
            }else{
                System.out.println("Opcion no valida, hasta luego");
                menu = 1;
            }

        }



        // Ejercicio1.llamadaSumaNumerosNaturales();
        // Ejercicio2.llamadaImprimirNumeros();
        // Ejercicio3.llamadaImprimirNumerosInverso();
        // Ejercicio4.llamadaContador();
        // Ejercicio5.llamadaFactorial();
        // Ejercicio6.llamadaFibonacci();


    }

}