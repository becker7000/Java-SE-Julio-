import java.util.ArrayList;
import java.util.Scanner;

public class Listas1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Los nombres de las listas van en plurar
        ArrayList<Double> numeros  = new ArrayList<>();

        System.out.print("\n\t Cantida de elementos: ");
        int max = scanner.nextInt(); scanner.nextLine();

        for (int i = 0; i < max; i++) {
            System.out.print("\n\t Dame un número: ");
            double auxiliar = scanner.nextDouble(); scanner.nextLine();
            numeros.add(auxiliar);
        }

        double menor = numeros.get(0); // get obtiene el elemento en un índice
        for (double numero : numeros) {
            if(menor>numero){
                menor=numero;
            }
        }

        // 9.2, 3.2, 5.6, 1.2
        // menor = 9.2 , menor = 3.2, menor = 1.2

        System.out.printf("\n\t El menor elemento de la lista es: %.2f",menor);
        System.out.printf("\n\t El índice del elemento menor es: %d",numeros.indexOf(menor));

        scanner.close();


    }

}
