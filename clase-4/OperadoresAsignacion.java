public class OperadoresAsignacion {

    public static void main(String[] args) {

        // La sumas inician en cero...
        int ahorro=0;

        ahorro+=100;
        ahorro+=200; // ahorro = ahorro + 200;
        ahorro+=180;
        ahorro-=80;
        ahorro*=2;

        // println deja un salto de línea al final de la línea...
        System.out.println("\n\t Ahorro final: $"+ahorro);
        System.out.print("\n\t Este fue un ahorro semanal...");
        System.out.printf("\n\t El ahorro final es: $%d",ahorro);

    }

}
