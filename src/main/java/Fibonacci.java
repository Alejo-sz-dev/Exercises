import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        System.out.print("");

        System.out.println("-------SECUENCIA FIBONACCI-------");

        int limite = 100;
        int a = 0;
        int b = 1;

        while(a<=limite){
            System.out.print(a + " ");

            int secuencia = a + b;
            a = b;
            b = secuencia;
        }
       
    } 
}
