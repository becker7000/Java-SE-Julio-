public class TestReciboCFE {

    public static void main(String[] args) {

        ReciboCFE recibo1 = new ReciboCFE(745.2);
        ReciboCFE recibo2 = new ReciboCFE(1231.6);
        ReciboCFE recibo3 = new ReciboCFE(5490.7);

        System.out.println(recibo1.generarRecibo());
        System.out.println(recibo2.generarRecibo());
        System.out.println(recibo3.generarRecibo());

    }

}
