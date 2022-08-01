import java.util.Scanner;

public class Numbers2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int segundos;
        System.out.print("\n\t Segundos: ");
        segundos=scanner.nextInt();
        scanner.nextLine(); // Cerramos la línea
        System.out.print("\n\t "+segundos+" segundos son equivalentes a: ");

        // 400 segundos = 6 minutos + 40 segundos
        int minutos = segundos/60;
        segundos = segundos%60;
        System.out.print(minutos+" minutos con "+segundos+" segundos");

        scanner.close();

    }

}
