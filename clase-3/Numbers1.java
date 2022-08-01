import java.util.Scanner;

public class Numbers1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables de tipo double (numeros con decimal)
        double sinIVA, conIVA;

        System.out.print("\n\t Dame un monto sin IVA: ");
        sinIVA = scanner.nextDouble();

        // Buena práctica para cuando guardamos un número (int, double,...)
        // Cerramos la línea:
        scanner.nextLine();

        // 100 -> 116
        conIVA=sinIVA*1.16;
        System.out.println("\n\t El monto con IVA es: "+conIVA);

        scanner.close();

    }

}
