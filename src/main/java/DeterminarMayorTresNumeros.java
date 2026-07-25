import java.util.Scanner;

public class DeterminarMayorTresNumeros {
    public static void main(String[] args) {
        
        System.out.println("**Determinar Numero Mayor**");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese un numero: ");
        int numero2 = sc.nextInt();
        System.out.print("Ingrese un numero: ");
        int numero3 = sc.nextInt();

        if(numero1 >= numero2 && numero1 >= numero3){
            System.out.print("El numeor mayor es: " + numero1);
        }else if(numero2 >= numero1 && numero2 >= numero3){
            System.out.print("El numero mayor es: " + numero2);
        }else{
            System.out.print("El numero mayor es: " + numero3);
        }
    }
    
}
