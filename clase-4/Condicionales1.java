import java.util.Scanner;

public class Condicionales1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t Escribe un número: ");
        double numero = scanner.nextDouble();
        scanner.nextLine();

        if(numero>0){
            System.out.println("\n\t El número es positivo...");
        }

        scanner.close();

    }

}
