public class Contacto {

    //Atributos:
    private int id;
    private String nombre;
    private String telefono;

    //Constructor:
    public Contacto(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //Getters and setters:
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrarContacto(){
        System.out.printf("\n\t | Id: %d | Nombre: %s | Teléfono: %s"
                ,id,nombre,telefono);
    }

}
