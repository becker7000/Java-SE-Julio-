import java.util.Scanner;

public class Vocales1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Dame una letra: ");
        char letra = scanner.nextLine().charAt(0);

        if(letra == 'a' || letra == 'A'){
            System.out.println("\n\t Primer vocal");
        }else if(letra == 'e' || letra == 'E'){
            System.out.println("\n\t Segunda vocal");
        }else if(letra == 'i' || letra == 'I'){
            System.out.println("\n\t Tercera vocal");
        }else if(letra == 'o' || letra == 'O'){
            System.out.println("\n\t Cuarta vocal");
        }else if(letra == 'u' || letra == 'U'){
            System.out.println("\n\t Quinta vocal");
        }else {
            System.out.println("\n\t El símbolo no es una vocal");
        }

        scanner.close();

    }

}
