public abstract class Usuario {

    protected String nombre;
    protected String clinica;

    public Usuario(String nombre, String clinica) {
        this.nombre = nombre;
        this.clinica = clinica;
    }

    // Así se declara un método abstracto
    public abstract void mostrar();

}
