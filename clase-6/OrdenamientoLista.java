import java.util.ArrayList;
import java.util.Scanner;

public class OrdenamientoLista {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t Dame una cantidad:  ");
        int cantidad = scanner.nextInt(); scanner.nextLine();

        // Llenamos el ArrayList
        ArrayList<Double> numeros = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("\n\t Dame un valor: ");
            double aux = scanner.nextDouble(); scanner.nextLine();
            numeros.add(aux);
        }

        ArrayList<Double> listaFinal = new ArrayList<>();
        while(!numeros.isEmpty()){
            double menor = numeros.get(0);
            for (double numero : numeros) {
                if (menor > numero) {
                    menor = numero;
                }
            }
            listaFinal.add(menor);
            numeros.remove(menor);
        }

        // Imprimimos la lista final
        System.out.print("\n\n\t Lista ordenada: ");
        for (double numero : listaFinal) {
            System.out.printf("\n\t %.2f",numero);
        }

        scanner.close();

    }

}
