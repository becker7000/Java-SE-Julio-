import java.util.Scanner;

public class Ternario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t Dame tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Cerramos la línea...

        String mensaje = (edad>=18)?
                "Eres mayor de edad":
                "Eres menor de edad";

        System.out.println("\n\t "+mensaje);

        scanner.close();

    }

}

