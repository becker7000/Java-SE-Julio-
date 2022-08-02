import java.util.Scanner;

public class Rangos1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t Dame un numero entero: ");
        int numero = scanner.nextInt(); scanner.nextLine();

        if(numero>=2 && numero<=5){
            System.out.println("\n\t Dentro del rango");
        }else{
            System.out.println("\n\t Fuera del rango");
        }

        scanner.close();

    }

}
