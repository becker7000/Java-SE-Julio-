import java.util.Scanner;

public class MiniLogin {

    public static void main(String[] args) {

        // Creamos un Scanner:
        Scanner entrada = new Scanner(System.in);

        String password ="ardillaferoz12345";

        System.out.print("\n\t Escribe tu contraseña: ");
        String passEntrada = entrada.nextLine();

        System.out.println("\n\t ¿Es correcta la contraseña? " +
                "Respuesta: "+password.equals(passEntrada));

        System.out.println("\n\t La contraseña correcta tiene: "+
                password.length()+" caracteres");

        //Cerramos el Scanner:
        entrada.close();
    }

}

/*
*   15 % 4 = 3
*   21 % 2 = 1
*   56 % 4 = 0
*   71 % 6 = 5
*   36 % 8 = 4
*   x % 7 = tuex < 7
* */
