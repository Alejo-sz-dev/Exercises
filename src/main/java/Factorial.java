import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        int resultado = 1;
        
        
        System.out.println("---Factorial de un Numero---");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        
        int numero = sc.nextInt();

        if (numero < 0){
            System.out.println("ERROR: NO HAY FACTORIAL");
        }else if (numero == 0 || numero == 1){
            System.out.println("Factorial: 1");
        }else {
            
        for(int i = 2; i <= numero; i++){
            
             resultado *= i;
            
        }System.out.println("EL factorial del numero " + numero + " es " + resultado);
    
    }
        
        }
       


}