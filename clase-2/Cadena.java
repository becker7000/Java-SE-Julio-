import java.util.Scanner; // Atajo: alt + intro

public class Cadena {

    public static void main(String[] args) {

        // La clase Scanner nos sirve para guardar
        // cualquier tipo de dato en tiempo de ejecución...
            Scanner entrada = new Scanner(System.in);
        // Nota: con print no hay salto de línea:
        System.out.print("\n\t Nombre: ");

        // Declaramos una cadena:
        String nombre;
        nombre = entrada.nextLine(); // Así guardamos una cadena

        // Nota: con println sí hay salto de línea:
        System.out.println("\n\t Bienvenid@: "+nombre);

        //Buena practica:
        entrada.close();

    }

}

/*
*       Nombre: Erick  así con print
*
*       Nombre:        así con println
* Erick
* */
