package Drons;

public abstract class Drone {
    protected int autonomia;
    protected double preuBase;
    protected TipusPropulsio tipusPropulsio;
    protected String model;

    public Drone(int autonomia, double preuBase, TipusPropulsio tipusPropulsio, String model) {
        this.autonomia = autonomia;
        this.preuBase = preuBase;
        this.tipusPropulsio = tipusPropulsio;
        this.model = model;
    }

    public static double CalcularPreuTotal(double preu) {
        return 0;
    }
    public static void mostrarInformacio() {
        System.out.println("");
    }

}
