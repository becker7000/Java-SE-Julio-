public class TestCirculo {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(6.5);
        Circulo circulo2 = new Circulo(10.2);

        System.out.print("\n\t Radio del circulo 1: "+circulo1.getRadio());
        circulo1.setRadio(8.2);
        System.out.print("\n\t "+circulo1);

        System.out.printf("\n\t Área del circulo 1: %.3f",circulo1.calcularArea());
        System.out.printf("\n\t Área del circulo 2: %.3f",circulo2.calcularArea());
        System.out.printf("\n\t Área 1 + área 2 = %.3f",circulo1.sumarAreaCon(circulo2));

        Circulo circulo3 = new Circulo();
        System.out.print("\n\t "+circulo3);

        Circulo circulo4 = new Circulo(circulo2);
        System.out.print("\n\t "+circulo4);

        System.out.printf("\n\t Área 3 + área 4 = %.3f",circulo3.sumarAreaCon(circulo4.calcularArea()));

        // Usando un método estático:
        Circulo.cuantosCirculosHay();

    }

}
