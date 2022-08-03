public class While1 {

    public static void main(String[] args) {

        int contador = 1; // 1, 2, 3, ... , 100
        // Nota: todas las variables que guardan sumas inician
        // en cero por defecto.
        int suma = 0;

        while(contador<=100){
            suma+=contador;
            contador++;
        }

        System.out.printf("\n\t Suma del 1 al 100: %d",suma);

    }

}
