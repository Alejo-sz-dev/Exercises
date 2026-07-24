import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
     //Variables
        var sc = new Scanner(System.in);

        System.out.print("Dame la altura del rec:");
        var altura = Integer.parseInt(sc.nextLine());
        System.out.print("Dame base del rec:");
        var base = Integer.parseInt(sc.nextLine());
        var area = base * altura;

        System.out.println("El area es: " + area);
    }
}
