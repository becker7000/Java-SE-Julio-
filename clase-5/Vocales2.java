import java.util.Scanner;

public class Vocales2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t Dame una letra: ");
        char letra = scanner.nextLine().charAt(0);

        switch (letra){
            case 'a': case 'A':
                System.out.println("\n\t Soy la primera vocal");
                break;
            case 'e': case 'E':
                System.out.println("\n\t Soy la segunda vocal");
                break;
            case 'i': case 'I':
                System.out.println("\n\t Soy la tercera vocal");
                break;
            case 'o': case 'O':
                System.out.println("\n\t Soy la cuarta vocal");
                break;
            case 'u': case 'U':
                System.out.println("\n\t Soy la quita vocal");
                break;
            default:
                System.out.println("\n\t No soy ninguna vocal");
                break;
        }

        /*

          Así sería con lambas:

           switch (letra) {
            case 'a', 'A' -> System.out.println("\n\t Soy la primera vocal");
            case 'e', 'E' -> System.out.println("\n\t Soy la segunda vocal");
            case 'i', 'I' -> System.out.println("\n\t Soy la tercera vocal");
            case 'o', 'O' -> System.out.println("\n\t Soy la cuarta vocal");
            case 'u', 'U' -> System.out.println("\n\t Soy la quita vocal");
            default -> System.out.println("\n\t No soy ninguna vocal");
           }

        */

        scanner.close();

    }

}
