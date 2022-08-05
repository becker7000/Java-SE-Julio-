public class Planeta {

    private String nombre;
    private int posicion;
    private String color;

    public Planeta(String nombre, int posicion, String color) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.color = color;
    }

    public void mostrarPlaneta(){
        System.out.print("\n\t +--------Planeta----------+");
        System.out.print("\n\t | Nombre: "+nombre);
        System.out.print("\n\t | Color: "+color);
        System.out.print("\n\t | Posición: "+posicion);
        System.out.print("\n\t +-------------------------+");
    }

    // El método toString por defecto devuelve una referencia de la memoria Stack:

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", posicion=" + posicion +
                ", color='" + color + '\'' +
                '}';
    }


}

// POJO: Plain old java object
