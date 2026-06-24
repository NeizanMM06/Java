package Drons;

public class DroneObservacio extends Drone{
    private Sensor[] sensor;

    public DroneObservacio(int autonomia, double preuBase, TipusPropulsio tipusPropulsio, String model) {
        super(autonomia, preuBase, tipusPropulsio, model);
    }

    public double calcularPreuTotal(double preu) {
        double total = 0;
        return total;
    }

    public static void  mostrarInfomarcio() {
        System.out.println("");
    }
}
