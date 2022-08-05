public class TestClinica {

    public static void main(String[] args) {

        Usuario u1 = new Doctor("Eduardo","Torres","Homeopatía");
        Usuario u2 = new Doctor("Laura","Torres","Neurología");
        Usuario u3 = new Doctor("Jose","Torres","Cardiología");
        Usuario u4 = new Deportista("Katia","Torres","Atletísmo");
        Usuario u5 = new Deportista("Daniel","Torres","Americano");
        Usuario u6 = new Deportista("Osvany","Torres","Soccer");

        // Polimorfismo:
        u1.mostrar();
        u2.mostrar();
        u3.mostrar();
        u4.mostrar();
        u5.mostrar();
        u6.mostrar();

    }

}
