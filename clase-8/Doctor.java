public class Doctor extends Usuario {

    private String especialidad;

    public Doctor(String nombre, String clinica, String especialidad) {
        super(nombre, clinica); // super hace referencia a la clase Usuario
        this.especialidad = especialidad; // this hace referencia a esta clase (Doctor)
    }

    @Override
    public void mostrar() {
        System.out.print("\n\t +--------DOCTOR----------+");
        System.out.print("\n\t |Nombre: "+nombre);
        System.out.print("\n\t |Clínica: "+clinica);
        System.out.print("\n\t |Especialidad: "+especialidad);
    }
}
