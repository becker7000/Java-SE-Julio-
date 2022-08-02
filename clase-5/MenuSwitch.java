import java.util.Scanner;

public class MenuSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t +-----------MENÚ-----------+");
        System.out.print("\n\t | Selecciona una opción:   |");
        System.out.print("\n\t | 1) Opcion uno            |");
        System.out.print("\n\t | 2) Opcion dos            |");
        System.out.print("\n\t | 3) Opcion tres           |");
        System.out.print("\n\t | 4) Opcion cuatro         |");
        System.out.print("\n\t +--------------------------+");
        System.out.print("\n\t | Opcion => ");
        int opcion = scanner.nextInt(); scanner.nextLine();

        switch (opcion){
            case 1:
                System.out.println("\n\t Soy la primera opcion");
                System.out.println("\n\t Hola... a todos...");
                break;
            case 2:
                System.out.println("\n\t Soy la opcion dos");
                break;
            case 3:
                System.out.println("\n\t Soy la opcion tres");
                break;
            case 4:
                System.out.println("\n\t Soy la opcion cuatro");
                break;
            default: // Opcional
                System.out.println("\n\t Soy una opcion no contemplada...");
                break; // Opcional
        }

        scanner.close();
    }

}
