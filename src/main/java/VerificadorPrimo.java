import java.util.Scanner;

public class VerificadorPrimo {
public static void main(String[] args) {

    Scanner  sc = new Scanner(System.in);

    System.out.println("Dame un numero: " );
    var numero  = Integer.parseInt(sc.nextLine());

    if (numero % 2 == 0){
        System.out.println("El numero es primo");
        }
        else {
            System.out.println("El numero no es primo");
        }
    }
}
