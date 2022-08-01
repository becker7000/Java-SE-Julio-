import java.util.Scanner;

public class Condicionales4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t Dame un número: ");
        int entero = scanner.nextInt(); scanner.nextLine();

        if(entero%7==0){
            System.out.println("\n\t El número es divisible por 7");
        }else {
            System.out.println("\n\t El número no es divisible por 7");
        }

        scanner.close();

    }

}
