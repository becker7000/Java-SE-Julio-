import java.util.Scanner;

public class DoWhile1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{ // Filtrando valores entre 1 y 5
            System.out.print("\n\t +-----------MENÚ-----------+");
            System.out.print("\n\t | Selecciona una opción:   |");
            System.out.print("\n\t | 1) Opcion uno            |");
            System.out.print("\n\t | 2) Opcion dos            |");
            System.out.print("\n\t | 3) Opcion tres           |");
            System.out.print("\n\t | 4) Opcion cuatro         |");
            System.out.print("\n\t | 5) Opcion cinco          |");
            System.out.print("\n\t +--------------------------+");
            System.out.print("\n\t | Opcion => ");
            opcion = scanner.nextInt();
            scanner.nextLine();
        }while(opcion<1 || opcion>5);

        System.out.println("\n\t  Opciona valida!");

        scanner.close();

    }

}
