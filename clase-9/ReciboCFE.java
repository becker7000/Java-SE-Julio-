public class ReciboCFE {

    // final te permite declarar una constante:
    private final double tarifa1 = 1.2;
    private final double tarifa2 = 1.5;
    private final double tarifa3 = 1.8;
    private double consumo;

    public ReciboCFE(double consumo) {
        this.consumo = consumo;
    }

    public String generarRecibo(){

        StringBuilder recibo = new StringBuilder();
        double monto;
        double tarifa;

        if (consumo<800){
            tarifa=tarifa1;
        }else if(consumo>=800 && consumo<=1450){
            tarifa=tarifa2;
        }else {
            tarifa=tarifa3;
        }

        monto=consumo*tarifa;

        recibo.append("\n\t +--------RECIBO--------+");
        recibo.append(String.format("\n\t | Consumo:  %.2f kWh",consumo));
        recibo.append(String.format("\n\t | Tarifa:  $%.2f",tarifa));
        recibo.append(String.format("\n\t | Monto:  $%.2f",monto));
        recibo.append("\n\t +------------------------+");

        return recibo.toString();
    }

}
