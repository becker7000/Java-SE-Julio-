import java.util.Scanner;

public class Condicionales2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Escribe dos numeros: ");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        scanner.nextLine();

        if(numA>numB){
            System.out.printf("\n\t %d es mayor que %d",numA,numB);
        }

        if(numB>numA){
            System.out.printf("\n\t %d es mayor que %d",numB,numA);
        }

        if(numA==numB){
            System.out.printf("\n\t %d es igual que %d",numA,numB);
        }

        scanner.close();

    }

}
