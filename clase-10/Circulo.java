public class Circulo {

    // Atributo
    private double radio;
    private static int cantidadDeCirculos=0;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
        cantidadDeCirculos++;
    }

    //Sobrecargando el constructor:
    public Circulo(){
        this.radio=1;
        cantidadDeCirculos++;
    }

    // Sobrecargando otra vez el contructor para clona un círculo:
    public Circulo(Circulo c){
        this.radio=c.getRadio();
        cantidadDeCirculos++;
    }

    // Getters y setters:

    public double getRadio() {
        // Buena practica:
        double rad=radio;
        return rad;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Métodos personalizados:

    public double calcularArea(){
        double area;
        area = Math.PI*Math.pow(radio,2);
        return area;
    }

    public double sumarAreaCon(Circulo c){
        double sumaAreas;
        sumaAreas = this.calcularArea()+c.calcularArea();
        return sumaAreas;
    } // circulo1 circulo2  -> circulo1.sumarAreaCon(circulo2)

    //Sobrecargando el método sumarAreaCon
    public double sumarAreaCon(double area){
        double sumaAreas;
        sumaAreas = this.calcularArea()+area;
        return sumaAreas;
    }

    public static void cuantosCirculosHay(){
        System.out.printf("\n\t Al momentos ha sido creados %d circulos...",cantidadDeCirculos);
    }

    // Sobreescritura de toString:
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
}
