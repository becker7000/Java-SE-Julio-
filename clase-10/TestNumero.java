import java.util.Scanner;

public class TestNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Dame un número(0-3999): ");
        String numeroTexto= scanner.nextLine();

        Numero numero = new Numero(numeroTexto);
        numero.mostrar();

        System.out.print("\n\t El número en romano es: "+
                numero.transformarARomano());

        scanner.close();

    }

}
