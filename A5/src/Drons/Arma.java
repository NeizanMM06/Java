package Drons;

public class Arma {
    private TipusArma tipusArma;
    private double preu;
    private double rang;

    public Arma(TipusArma tipusArma, double preu, double rang) {
        this.tipusArma = tipusArma;
        this.preu = preu;
        this.rang = rang;
    }

    public double getPreu() {
        return preu;
    }
    public static void mostrarInformacio() {

    }
}
