import java.util.Scanner;

public class Rangos2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t Dame un numero entero: ");
        int numero = scanner.nextInt(); scanner.nextLine();

        if((numero>=5 && numero<=7)||(numero>=10 && numero<=12)){
            System.out.println("\n\t Dentro del rango");
        }else{
            System.out.println("\n\t Fuera del rango");
        }

        scanner.close();


    }

}
