import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t Dame un número para crear un tríangulo: ");
        int pisos = scanner.nextInt(); scanner.nextLine();
        int i=0, j;

        while(i<=pisos){
            j=0;
            System.out.println(); // Salto de línea
            while(j<i){
                System.out.print("\t*");
                j++;
            }
            i++;
        }

        scanner.close();

    }

}

/*
        Dame un número: 3

             *
            * *
           * * *

        Dame un número: 4

             *
            * *
           * * *
          * * * *
           * * *
            * *
             *

*/

/*
*   Diferencias entre for y while:
*
*   Usamos for cuando sabemos el número de exacto de veces
*   que vamos a iterar (repetir) un bloque de código.
*
*   En cambio, usamos while cuando no sabemos el número exacto
*   de veces que vamos a iterar un bloque de código pero sí
*   la condición bajo la cúal vamos a iterar.
*
*   do-while en cambio, ejecuta al menos una vez el bloque de código
*   y ya depende de la condición que se vuelva a ejecutar tal bloque.
*
* */