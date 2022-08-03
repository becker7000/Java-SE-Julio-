public class For1 {

    public static void main(String[] args) {
        // Todos los ciclos siempre deben tener
        // tres elementos básicos:
        // 1) Variable de control
        // 2) Condición
        // 3) Incremento

        // Si utilizas println usas + (concatenación)
        // Si utilizas printf usas códigos de formato (%d)
        System.out.println("\n\n\t Ascendente: ");
        for(int i=1;i<=10;i++){
            System.out.printf("\n\t i = %d ",i);
        }

        System.out.println("\n\n\t Descendente: ");
        for(int i=10;i>=1;i--){
            System.out.printf("\n\t i = %d ",i);
        }

    }

}
