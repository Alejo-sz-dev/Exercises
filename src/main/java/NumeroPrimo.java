import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {

        System.out.println("**VERIFICAR SI ES NUMERO PRIMO**");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el numero: ");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println("El numero no es primo");
            return;
        }

        boolean esPrimo = true;

        for (int i = 2; i < numero; i++) {

            if (numero % i == 0) {
                esPrimo = false;
                break;
            }

        }

        if (esPrimo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }
}