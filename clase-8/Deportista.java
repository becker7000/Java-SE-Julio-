public class Deportista extends Usuario {

    private String deporte;

    public Deportista(String nombre, String clinica, String deporte) {
        super(nombre, clinica);
        this.deporte=deporte;
    }

    @Override
    public void mostrar() {
        System.out.print("\n\t +--------DEPORTISTA----------+");
        System.out.print("\n\t |Nombre: "+nombre);
        System.out.print("\n\t |Clínica: "+clinica);
        System.out.print("\n\t |Deporte: "+deporte);
    }

}
