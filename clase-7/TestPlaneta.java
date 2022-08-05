
public class TestPlaneta {

    public static void main(String[] args) {

        // Clase (nombre-instancia) = new (Constructor)
        Planeta pla1 = new Planeta("Mercurio",1,"Anaranjado");
        Planeta pla2 = new Planeta("Venus",2,"Gris");
        Planeta pla3 = new Planeta("Tierra",3,"Azul");

        // Aplicando el método mostrarPlaneta()
        pla1.mostrarPlaneta();
        pla2.mostrarPlaneta();
        pla3.mostrarPlaneta();

        System.out.println();
        System.out.println(pla1);

    }

}
