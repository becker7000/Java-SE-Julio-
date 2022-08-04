public class Planeta {

    private String nombre;
    private int posicion;
    private String color;

    public Planeta(String nombre){
        this.nombre = nombre;
    }

    public void mostrarPlaneta(){
        System.out.print("\n\t Nombre: "+nombre);
    }

}

// POJO: Plain old java object
