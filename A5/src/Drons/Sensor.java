package Drons;

public class Sensor {
    private TipusSensor tipusSensor;
    private double preu;


    public Sensor(TipusSensor tipusSensor, double preu) {
        this.tipusSensor = tipusSensor;
        this.preu = preu;
    }

    public double getPreu() {
        return preu;
    }

    public static void  mostrarInformacio() {
        System.out.println("");
    }
}
